package UserDb;

import java.util.Objects;

public class User implements IUser {
    private final String key;
    private String username;
    private String password;

    private User(String key) { this.key = key; }

    public User(IRecord record) throws ClassCastException {
        this.key = record.getKey();
        this.username = (String) record.getCell("username");
        this.password = (String) record.getCell("password");
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public Object clone() throws CloneNotSupportedException {
        super.clone();
        User newUser = new User(this.key);
        newUser.username = this.username;
        newUser.password = this.password;
        return newUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return key.equals(user.key) && username.equals(user.username) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, username, password);
    }
}
