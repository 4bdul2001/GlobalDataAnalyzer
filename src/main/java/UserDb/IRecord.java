package UserDb;

public interface IRecord {
    String getKey();

    Object getCell(String name);

    String[] getColumns();
}
