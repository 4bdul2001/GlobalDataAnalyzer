package UserDb;

public interface ITableDataSourceFactory {
    ITableDataSource createTableDataSource() throws ITableDataSource.TableDataSourceException;
}
