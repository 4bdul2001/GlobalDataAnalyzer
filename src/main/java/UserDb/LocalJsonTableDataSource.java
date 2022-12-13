package UserDb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class LocalJsonTableDataSource implements ITableDataSource {
    private final String fileName;

    private final File file;

    private JSONObject data;
    private JSONObject meta;

    private String[] columns;

    private String generateNewId() {
        UUID newId = UUID.randomUUID();
        return newId.toString();
    }

    private String readFileAsString() throws DbFileNotFoundException {
        String text = "";
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                text += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new DbFileNotFoundException(this.fileName);
        }

        return text;
    }

    private void parseStringIntoJsonObject(String text) {
        JSONObject obj = (JSONObject) JSON.parse(text);
        JSONObject meta = obj.getJSONObject("0");
        this.meta = meta;
        JSONArray columns = meta.getJSONArray("columns");
        this.columns = (String[]) columns.toArray(new String[0]);
        obj.remove("0");
        this.data = obj;
    }

    private void validateJsonString(String text) throws TableDataSourceException {
        JSONObject obj = (JSONObject) JSON.parse(text);

        JSONObject meta = obj.getJSONObject("0");

        if(meta == null) {
            throw new NoMetaException();
        }

        JSONArray columns = meta.getJSONArray("columns");

        if(columns == null) {
            throw new NoColumnsException();
        }

        JSONObject rows = (JSONObject) obj.clone();
        rows.remove("0");
        String[] keys = rows.keySet().toArray(new String[]{});

        for (Object col : columns) {
            for(String key : keys) {
                JSONObject row = rows.getJSONObject(key);
                if(!row.containsKey(col))
                    throw new UnexpectedStructureException();
            }
        }

        for (String key : keys) {
            JSONObject row = rows.getJSONObject(key);
            String[] rowColumns = row.keySet().toArray(new String[]{});
            for (String rowColumn : rowColumns) {
                if(!columns.contains(rowColumn))
                    throw new UnexpectedStructureException();
            }
        }
    }

    private boolean isRecordValid(IRecord record) {
        for (String col : columns) {
            if(record.getCell(col) == null)
                return false;
        }

        List<String> columnsList = Arrays.asList(columns);
        String[] recordColumns = record.getColumns();
        for (String recordColumn : recordColumns) {
            if(!columnsList.contains(recordColumn))
                return false;
        }
        return true;
    }

    public LocalJsonTableDataSource(String fileName) throws TableDataSourceException {
        this.fileName = fileName;
        file = new File(fileName);
        String fileString = readFileAsString();
        validateJsonString(fileString);
        parseStringIntoJsonObject(fileString);
    }

    @Override
    public String[] getKeys() {
        return data.keySet().toArray(new String[]{});
    }

    @Override
    public String[] getColumns() {
        return this.columns;
    }

    @Override
    public IRecord getRecord(String key) {
        return new JsonRecord(key, data.getJSONObject(key));
    }

    @Override
    public IRecord updateRecord(IRecord newRecord) throws InvalidRecordException {
        String key = newRecord.getKey();

        JSONObject row = data.getJSONObject(key);
        if(row == null)
            throw new InvalidRecordException("cannot update record: a record with key \"" + key + "\" doesn't exist");

        JSONObject newRow = (JSONObject) row.clone();

        for (String column: columns) {
            if(newRecord.getCell(column) == null) {continue;}
            if(String.valueOf(newRecord.getCell(column)).equals(row.getString(column))) {
                continue;
            }
            newRow.put(column, newRecord.getCell(column));
        }
        this.data.put(key, newRow.clone());
        return new JsonRecord(key, newRow);
    }

    @Override
    public IRecord createRecord(IRecord newRecord) throws InvalidRecordException {
        if(!isRecordValid(newRecord))
            throw new InvalidRecordException("the record in createRecord was invalid");
        JSONObject newRow = new JSONObject();
        for (String column: columns) {
            newRow.put(column, String.valueOf(newRecord.getCell(column)));
        }
        String newKey = generateNewId();
        data.put(newKey, newRow.clone());
        return new JsonRecord(newKey, newRow);
    }

    @Override
    public IRecord removeRecord(String key) throws InvalidRecordException {
        JSONObject recordToRemove = data.getJSONObject(key);
        if(recordToRemove == null)
            throw new InvalidRecordException("cannot remove record: record with key \"" + key + "\" doesn't exist");

        data.remove(key);
        return new JsonRecord(key, recordToRemove);
    }

    @Override
    public void close() throws Exception {
        JSONObject objToWrite = (JSONObject) data.clone();
        objToWrite.put("0", meta);
        String jsonString = objToWrite.toJSONString();

        FileWriter myWriter = new FileWriter(file, false);
        myWriter.write(jsonString);
        myWriter.close();
    }

    public static class NoColumnsException extends TableDataSourceException {
        public NoColumnsException() {
            super("No columns detected in the metadata");
        }
    }

    public static class NoMetaException extends TableDataSourceException {
        public NoMetaException() {
            super("No meta entry detected in the json file (key=\"0\")");
        }
    }

    public static class UnexpectedStructureException extends TableDataSourceException {
        public UnexpectedStructureException() {
            super("The structure of the JSON table is unexpected. Expected values to follow the columns defined in the metadata");
        }
    }

    public static class DbFileNotFoundException extends TableDataSourceException {
        public DbFileNotFoundException(String fileName) {
            super("Specified JSON db file does not exist: " + fileName);
        }
    }

    public static class InvalidRecordException extends TableDataSourceException {
        public InvalidRecordException(String message) {
            super("Invalid record encountered: " + message);
        }
    }
}
