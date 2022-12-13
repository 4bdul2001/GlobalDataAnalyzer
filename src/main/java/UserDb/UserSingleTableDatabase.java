package UserDb;

public class UserSingleTableDatabase implements ISingleTableDatabase<IUser> {
    private final ITableDataSourceFactory dataSourceFactory;

    public UserSingleTableDatabase(ITableDataSourceFactory dataSourceFactory) {
        this.dataSourceFactory = dataSourceFactory;
    }

    @Override
    public String[] getKeys() throws DatabaseException {
        try(ITableDataSource dataSource = dataSourceFactory.createTableDataSource()) {
            return dataSource.getKeys();
        } catch(ITableDataSource.TableDataSourceException e) {
            throw new DatabaseException("Data source exception: " + e.getMessage());
        } catch(Exception e) {
            throw new DatabaseException("Could not close TableDataSource: " + e.getMessage());
        }
    }

    @Override
    public IUser createRecord(IUser newUser) throws DatabaseException {
        try(ITableDataSource dataSource =
                    dataSourceFactory.createTableDataSource()
        ) {
            IRecord createdRecord = dataSource.createRecord(new UserRecord(newUser));
            return new User(createdRecord);
        } catch(ITableDataSource.TableDataSourceException e) {
            throw new DatabaseException("Data source exception: " + e.getMessage());
        } catch(Exception e) {
            throw new DatabaseException("Could not close TableDataSource: " + e.getMessage());
        }
    }

    @Override
    public IUser updateRecord(IUser updatedUser) throws DatabaseException {
        try(ITableDataSource dataSource =
                    dataSourceFactory.createTableDataSource()
        ) {
            IRecord updatedRecord = dataSource.updateRecord(new UserRecord(updatedUser));
            return new User(updatedRecord);
        } catch(ITableDataSource.TableDataSourceException e) {
            throw new DatabaseException("Data source exception: " + e.getMessage());
        } catch(Exception e) {
            throw new DatabaseException("Could not close TableDataSource: " + e.getMessage());
        }
    }

    @Override
    public IUser getRecord(String id) throws DatabaseException {
        try(ITableDataSource dataSource =
                    dataSourceFactory.createTableDataSource()
        ) {
            IRecord record = dataSource.getRecord(id);
            return new User(record);
        } catch(ITableDataSource.TableDataSourceException e) {
            throw new DatabaseException("Data source exception: " + e.getMessage());
        } catch(Exception e) {
            throw new DatabaseException("Could not close TableDataSource: " + e.getMessage());
        }
    }

    @Override
    public IUser removeRecord(String id) throws DatabaseException {
        try(ITableDataSource dataSource =
                    dataSourceFactory.createTableDataSource()
        ) {
            IRecord record = dataSource.removeRecord(id);
            return new User(record);
        } catch(ITableDataSource.TableDataSourceException e) {
            throw new DatabaseException("Data source exception: " + e.getMessage());
        } catch(Exception e) {
            throw new DatabaseException("Could not close TableDataSource: " + e.getMessage());
        }
    }
}
