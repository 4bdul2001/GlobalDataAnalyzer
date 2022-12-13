package UserDb;

import UserDb.ISingleTableDatabase.DatabaseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MockRecord implements IRecord {
    @Override
    public String getKey() {
        return "key";
    }

    @Override
    public Object getCell(String name) {
        return name;
    }

    @Override
    public String[] getColumns() {
        return new String[]{"col1", "col2", "col3"};
    }
}

class MockTableDataSource implements ITableDataSource {
    public static String[] KEYS = new String[]{"key1", "key2", "key3"};
    public static String[] COLUMNS = new String[]{"col1", "col2", "col3"};
    public static MockRecord RECORD = new MockRecord();
    public static int closeCalls = 0;

    private final boolean throwExceptions;

    public MockTableDataSource(boolean throwExceptions) {
        this.throwExceptions = throwExceptions;
    }

    @Override
    public String[] getKeys() throws TableDataSourceException {
        if(throwExceptions)
            throw new TableDataSourceException("getKeys exception");
        return KEYS;
    }

    @Override
    public String[] getColumns() throws TableDataSourceException {
        if(throwExceptions)
            throw new TableDataSourceException("getColumns exception");
        return COLUMNS;
    }

    @Override
    public IRecord getRecord(String key) throws TableDataSourceException {
        if(throwExceptions)
            throw new TableDataSourceException("getRecord exception");
        return RECORD;
    }

    @Override
    public IRecord updateRecord(IRecord newRecord) throws TableDataSourceException {
        if(throwExceptions)
            throw new TableDataSourceException("updateRecord exception");
        return new MockRecord();
    }

    @Override
    public IRecord createRecord(IRecord newRecord) throws TableDataSourceException {
        if(throwExceptions)
            throw new TableDataSourceException("createRecord exception");
        return new MockRecord();
    }

    @Override
    public IRecord removeRecord(String key) throws TableDataSourceException {
        if(throwExceptions)
            throw new TableDataSourceException("removeRecord exception");
        return new MockRecord();
    }

    @Override
    public void close() throws Exception {
        if(throwExceptions)
            throw new Exception();
        closeCalls++;
    }
}

class MockTableDataSourceFactory implements ITableDataSourceFactory {
    @Override
    public ITableDataSource createTableDataSource() {
        return new MockTableDataSource(false);
    }
}

class MockThrowingTableDataSourceFactory implements ITableDataSourceFactory {
    @Override
    public ITableDataSource createTableDataSource() {
        return new MockTableDataSource(true);
    }
}

public class UserSingleTableDatabaseTest {
    UserSingleTableDatabase db;
    UserSingleTableDatabase throwingDb;

    @BeforeEach
    public void BeforeEach() {
        db = new UserSingleTableDatabase(new MockTableDataSourceFactory());
        throwingDb = new UserSingleTableDatabase(new MockThrowingTableDataSourceFactory());
    }

    @Test
    public void GetKeysReturnsKeysTest() throws DatabaseException {
        assertEquals(MockTableDataSource.KEYS, db.getKeys());
    }

    @Test
    public void GetKeysClosesDataSourceTest() throws DatabaseException {
        int timesClosed = MockTableDataSource.closeCalls;
        db.getKeys();
        assertEquals(timesClosed + 1, MockTableDataSource.closeCalls);
    }

    @Test
    public void GetKeysThrowsOnDataSourceThrowTest() {
        assertThrows(DatabaseException.class, () -> throwingDb.getKeys());
    }

    @Test
    public void CreateRecordReturnsAUserTest() throws DatabaseException {
        assertEquals("username", db.createRecord(null).getUsername());
        assertEquals("password", db.createRecord(null).getPassword());
    }

    @Test
    public void CreateRecordClosesDataSourceTest() throws DatabaseException {
        int timesClosed = MockTableDataSource.closeCalls;
        db.createRecord(null);
        assertEquals(timesClosed + 1, MockTableDataSource.closeCalls);
    }

    @Test
    public void CreateRecordThrowsOnDataSourceThrowTest() {
        assertThrows(DatabaseException.class, () -> throwingDb.createRecord(null));
    }

    @Test
    public void UpdateRecordReturnsAUserTest() throws DatabaseException {
        assertEquals("username", db.updateRecord(null).getUsername());
        assertEquals("password", db.updateRecord(null).getPassword());
    }

    @Test
    public void UpdateRecordClosesDataSourceTest() throws DatabaseException {
        int timesClosed = MockTableDataSource.closeCalls;
        db.updateRecord(null);
        assertEquals(timesClosed + 1, MockTableDataSource.closeCalls);
    }

    @Test
    public void UpdateRecordThrowsOnDataSourceThrowTest() {
        assertThrows(DatabaseException.class, () -> throwingDb.updateRecord(null));
    }

    @Test
    public void GetRecordReturnsAUserTest() throws DatabaseException {
        assertEquals("username", db.getRecord("").getUsername());
        assertEquals("password", db.getRecord("").getPassword());
    }

    @Test
    public void GetRecordClosesDataSourceTest() throws DatabaseException {
        int timesClosed = MockTableDataSource.closeCalls;
        db.getRecord("");
        assertEquals(timesClosed + 1, MockTableDataSource.closeCalls);
    }

    @Test
    public void GetRecordThrowsOnDataSourceThrowTest() {
        assertThrows(DatabaseException.class, () -> throwingDb.getRecord(""));
    }

    @Test
    public void RemoveRecordReturnsAUserTest() throws DatabaseException {
        assertEquals("username", db.removeRecord("").getUsername());
        assertEquals("password", db.removeRecord("").getPassword());
    }

    @Test
    public void RemoveRecordClosesDataSourceTest() throws DatabaseException {
        int timesClosed = MockTableDataSource.closeCalls;
        db.removeRecord("");
        assertEquals(timesClosed + 1, MockTableDataSource.closeCalls);
    }

    @Test
    public void RemoveRecordThrowsOnDataSourceThrowTest() {
        assertThrows(DatabaseException.class, () -> throwingDb.removeRecord(""));
    }
}
