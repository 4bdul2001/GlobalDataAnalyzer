package UserDb;

public class UserRecord implements IRecord {
    IUser user;

    public UserRecord(IUser user) {
        this.user = user;
    }

    @Override
    public String getKey() {
        return user.getKey();
    }

    @Override
    public Object getCell(String name) {
        if(name.equals("username"))
            return user.getUsername();
        if(name.equals("password"))
            return user.getPassword();
        return null;
    }

    @Override
    public String[] getColumns() {
        return new String[]{"username", "password"};
    }
}
