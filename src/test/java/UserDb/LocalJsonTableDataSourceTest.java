package UserDb;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import UserDb.LocalJsonTableDataSource.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class LocalJsonTableDataSourceTest {

    public static final String VALID_TEST_DB_PATH = "src/test/resources/UserDb/usertestdb.json";
    public static final String NOMETA_TEST_DB_PATH = "src/test/resources/UserDb/usertestdb_nometa.json";
    public static final String NOCOLUMNS_TEST_DB_PATH = "src/test/resources/UserDb/usertestdb_nocolumns.json";
    public static final String MALFORMED_TEST_DB_PATH = "src/test/resources/UserDb/usertestdb_malformed.json";
    public static final String EXTRA_FIELD_STRUCTURE_TEST_DB_PATH = "src/test/resources/UserDb/usertestdb_extra_field_unexpected.json";
    public static final String MISSING_FIELD_STRUCTURE_TEST_DB_PATH = "src/test/resources/UserDb/usertestdb_missing_field_unexpected.json";
    public static final String NONEXISTENT_TEST_DB_PATH = "src/test/resources/UserDb/usertestdb_nonexistent.json";

    private String createACopyOfAFile(String originalFilePath) throws IOException {
        String origFileString = getFileAsString(originalFilePath);

        String randomString = getRandomString();

        String copyFilePath = originalFilePath + "." + randomString;
        File copy = new File(copyFilePath);
        copy.createNewFile();

        writeToFile(origFileString, copy);

        return copyFilePath;
    }

    private static String getFileAsString(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        return readFromFile(file);
    }

    private static String readFromFile(File file) throws FileNotFoundException {
        String fileString = "";
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fileString += data;
        }
        myReader.close();
        return fileString;
    }

    private static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("_", "");
    }

    private static void writeToFile(String contents, File file) throws IOException {
        FileWriter myWriter = new FileWriter(file, false);
        myWriter.write(contents);
        myWriter.close();
    }

    private void deleteFile(String filePath) {
        File file = new File(filePath);
        file.delete();
    }

    private String tempDbFilePath;

    @BeforeEach
    public void BeforeEach() throws IOException {
        tempDbFilePath = createACopyOfAFile(VALID_TEST_DB_PATH);
    }

    @AfterEach
    public void AfterEach() {
        deleteFile(tempDbFilePath);
        tempDbFilePath = null;
    }

    @Test
    public void ConstructsWithNoExceptionTest() {
        assertDoesNotThrow(() ->
                new LocalJsonTableDataSource(
                        VALID_TEST_DB_PATH
                ).close()
        );
    }

    @Test
    public void NoMetaExceptionOnConstructionTest() {
        assertThrows(NoMetaException.class, () ->
                new LocalJsonTableDataSource(
                        NOMETA_TEST_DB_PATH
                ).close()
        );
    }

    @Test
    public void NoColumnsExceptionOnConstructionTest() {
        assertThrows(NoColumnsException.class, () ->
                new LocalJsonTableDataSource(
                        NOCOLUMNS_TEST_DB_PATH
                ).close()
        );
    }

    @Test
    public void JsonExceptionOnConstructionTest() {
        assertThrows(JSONException.class, () ->
                new LocalJsonTableDataSource(
                        MALFORMED_TEST_DB_PATH
                ).close()
        );
    }

    @Test
    public void UnexpectedStructureExceptionOnConstructionExtraFieldTest() {
        assertThrows(UnexpectedStructureException.class, () ->
                new LocalJsonTableDataSource(
                        EXTRA_FIELD_STRUCTURE_TEST_DB_PATH
                ).close()
        );
    }

    @Test
    public void UnexpectedStructureExceptionOnConstructionMissingFieldTest() {
        assertThrows(UnexpectedStructureException.class, () ->
                new LocalJsonTableDataSource(
                        MISSING_FIELD_STRUCTURE_TEST_DB_PATH
                ).close()
        );
    }

    @Test
    public void DbFileNotFoundExceptionOnNonExistentFile() {
        assertThrows(DbFileNotFoundException.class, () ->
                new LocalJsonTableDataSource(
                        NONEXISTENT_TEST_DB_PATH
                ).close()
        );
    }

    @Test
    public void GetKeysTest() throws Exception {
        List<String> expectedKeys = Arrays.asList("&^812bc", "q23fasdfg", "asdgasdgb");

        try(LocalJsonTableDataSource dataSource =
                    new LocalJsonTableDataSource(
                            VALID_TEST_DB_PATH
                    )
        ) {
            List<String> actualKeys = Arrays.asList(dataSource.getKeys());
            for (String expectedKey: expectedKeys) {
                assertTrue(actualKeys.contains(expectedKey));
            }
            for (String actualKey: actualKeys) {
                assertTrue(expectedKeys.contains(actualKey));
            }
        }
    }

    @Test
    public void GetColumnsTest() throws Exception {
        List<String> expectedColumns = Arrays.asList("username", "password");

        try(LocalJsonTableDataSource dataSource =
                    new LocalJsonTableDataSource(
                            VALID_TEST_DB_PATH
                    )
        ) {
            List<String> actualColumns = Arrays.asList(dataSource.getColumns());
            for (String expectedColumn: expectedColumns) {
                assertTrue(actualColumns.contains(expectedColumn));
            }
            for (String actualColumn: actualColumns) {
                assertTrue(expectedColumns.contains(actualColumn));
            }
        }
    }

    @Test
    public void GetExistingRecordTest() throws Exception {
        try(LocalJsonTableDataSource dataSource =
                new LocalJsonTableDataSource(VALID_TEST_DB_PATH)
        ) {
            IRecord record = dataSource.getRecord("&^812bc");
            assertNotNull(record);
        }
    }

    @Test
    public void GetNonExistingRecordTest() throws Exception {
        try(LocalJsonTableDataSource dataSource =
                    new LocalJsonTableDataSource(VALID_TEST_DB_PATH)
        ) {
            IRecord record = dataSource.getRecord("nonexisting");
            assertNotNull(record);
        }
    }

    @Test
    public void CreateValidRecordTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                getRandomString(),
                JSONObject.parseObject("{\"username\": \"user\", \"password\": \"pw\"}")
        );

        try(LocalJsonTableDataSource dataSource =
                    new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            IRecord record = dataSource.createRecord(newRecord);
            assertNotNull(record);
        }
    }

    @Test
    public void CreateInvalidRecordExtraFieldTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                getRandomString(),
                JSONObject.parseObject("{\"username\": \"user\", \"password\": \"pw\", \"extrafield\": \"huh\"}")
        );

        try(LocalJsonTableDataSource dataSource =
                    new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            assertThrows(InvalidRecordException.class, () -> dataSource.createRecord(newRecord));
        }
    }

    @Test
    public void CreateInvalidRecordMissingFieldTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                getRandomString(),
                JSONObject.parseObject("{\"username\": \"user\"}")
        );

        try(LocalJsonTableDataSource dataSource =
                    new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            assertThrows(InvalidRecordException.class, () -> dataSource.createRecord(newRecord));
        }
    }

    @Test
    public void CreateInvalidRecordNullValue() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                getRandomString(),
                JSONObject.parseObject("{\"username\": \"user\", \"password\": null}")
        );

        try(LocalJsonTableDataSource dataSource =
                    new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            assertThrows(InvalidRecordException.class, () -> dataSource.createRecord(newRecord));
        }
    }

    @Test
    public void UpdateValidRecordTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                "&^812bc",
                JSONObject.parseObject("{\"username\": \"user\", \"password\": \"newpassword\"}")
        );

        try (LocalJsonTableDataSource dataSource =
                     new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            IRecord record = dataSource.updateRecord(newRecord);
            assertEquals("user", record.getCell("username"));
            assertEquals("newpassword", record.getCell("password"));
        }
    }

    @Test
    public void PartialUpdateValidRecordTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                "&^812bc",
                JSONObject.parseObject("{\"password\": \"verynewpassword\"}")
        );

        try (LocalJsonTableDataSource dataSource =
                     new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            IRecord record = dataSource.updateRecord(newRecord);
            assertEquals("user3", record.getCell("username"));
            assertEquals("verynewpassword", record.getCell("password"));
        }
    }

    @Test
    public void SameValueUpdateValidRecordTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                "&^812bc",
                JSONObject.parseObject("{\"username\": \"user3\",\"password\": \"password3\"}")
        );

        try (LocalJsonTableDataSource dataSource =
                     new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            IRecord record = dataSource.updateRecord(newRecord);
            assertEquals("user3", record.getCell("username"));
            assertEquals("password3", record.getCell("password"));
        }
    }

    @Test
    public void EmptyUpdateValidRecordTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                "&^812bc",
                JSONObject.parseObject("{}")
        );

        try (LocalJsonTableDataSource dataSource =
                     new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            IRecord record = dataSource.updateRecord(newRecord);
            assertEquals("user3", record.getCell("username"));
            assertEquals("password3", record.getCell("password"));
        }
    }

    @Test
    public void InvalidRecordExceptionOnUpdateNonExistentRecordTest() throws Exception {
        JsonRecord newRecord = new JsonRecord(
                "nonexistent",
                JSONObject.parseObject("{\"username\": \"nonexistent1\"}")
        );

        try (LocalJsonTableDataSource dataSource =
                     new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            assertThrows(InvalidRecordException.class, () ->
                    dataSource.updateRecord(newRecord)
            );
        }
    }

    @Test
    public void RemoveValidRecordTest() throws Exception {
        String key = "&^812bc";

        try (LocalJsonTableDataSource dataSource =
                     new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            IRecord removedRecord = dataSource.removeRecord(key);
            assertEquals(key ,removedRecord.getKey());
            assertEquals("user3", removedRecord.getCell("username"));
            assertEquals("password3", removedRecord.getCell("password"));
        }
    }

    @Test
    public void InvalidRecordExceptionOnRemoveNonExistentRecordTest() throws Exception {
        String key = "nonexistent";

        try (LocalJsonTableDataSource dataSource =
                     new LocalJsonTableDataSource(tempDbFilePath)
        ) {
            assertThrows(InvalidRecordException.class, () ->
                    dataSource.removeRecord(key)
            );
        }
    }
}
