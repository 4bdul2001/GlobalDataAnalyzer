package UserDb;

import com.alibaba.fastjson.JSONObject;

public class JsonRecord implements IRecord {
    private final String key;
    private final JSONObject object;

    public JsonRecord(String key, JSONObject object) {
        this.key = key;
        this.object = object;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Object getCell(String name) {
        return object == null ? null : object.getString(name);
    }

    @Override
    public String[] getColumns() {
        return object == null ? new String[0] : object.keySet().toArray(new String[0]);
    }
}
