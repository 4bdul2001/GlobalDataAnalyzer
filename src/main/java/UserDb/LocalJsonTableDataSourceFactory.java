package UserDb;

import UserDb.ITableDataSource.TableDataSourceException;

public class LocalJsonTableDataSourceFactory implements ITableDataSourceFactory {

    private final String fileName;

    public LocalJsonTableDataSourceFactory(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ITableDataSource createTableDataSource() throws TableDataSourceException {
        return new LocalJsonTableDataSource(fileName);
    }
}
