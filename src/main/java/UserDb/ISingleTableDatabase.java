package UserDb;

public interface ISingleTableDatabase<T extends IDbRecord> {
    String[] getKeys() throws DatabaseException;

    T createRecord(T newT) throws DatabaseException;

    T updateRecord(T updatedT) throws DatabaseException;

    T getRecord(String id) throws DatabaseException;

    T removeRecord(String id) throws DatabaseException;

    class DatabaseException extends Exception {
        public DatabaseException(String message) {super(String.format("Database exception: %s", message));}
    }
}
