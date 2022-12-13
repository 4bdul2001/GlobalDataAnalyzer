package UserDb;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static UserDb.ISingleTableDatabase.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserDbModelTest {
    private static final User MOCK_RECORD = new User(new JsonRecord(
            "key",
            JSONObject.parseObject("{\"username\": \"user\", \"password\": \"pw\"}")
    ));

    private static final User MOCK_NULL_RECORD = null;

    private static class MockUserSingleTableDatabase implements ISingleTableDatabase<IUser> {

        public static User mockRecord;

        static {
            try {
                mockRecord = (User) UserDbModelTest.MOCK_RECORD.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String[] getKeys() {
            return new String[0];
        }

        @Override
        public IUser createRecord(IUser newT) {
            return MockUserSingleTableDatabase.mockRecord;
        }

        @Override
        public IUser updateRecord(IUser updatedT) {
            return MockUserSingleTableDatabase.mockRecord;
        }

        @Override
        public IUser getRecord(String id) {
            return MockUserSingleTableDatabase.mockRecord;
        }

        @Override
        public IUser removeRecord(String id) {
            return MockUserSingleTableDatabase.mockRecord;
        }
    }
    private UserDbModel model;

    @BeforeEach
    public void beforeEach() throws CloneNotSupportedException {
        model = new UserDbModel(new MockUserSingleTableDatabase());
        MockUserSingleTableDatabase.mockRecord = (User) MOCK_RECORD.clone();
    }

    @Test
    public void CreateUserTest() throws DatabaseException {
        assertEquals(MOCK_RECORD, model.createUser(null));
    }

    @Test
    public void CreateUserNullTest() throws DatabaseException {
        MockUserSingleTableDatabase.mockRecord = MOCK_NULL_RECORD;
        assertEquals(MOCK_NULL_RECORD, model.createUser(null));
    }

    @Test
    public void GetUserByKeyTest() throws DatabaseException {
        assertEquals(MOCK_RECORD, model.getUserById("someid"));
    }

    @Test
    public void GetUserByKeyNullTest() throws DatabaseException {
        MockUserSingleTableDatabase.mockRecord = MOCK_NULL_RECORD;
        assertEquals(MOCK_NULL_RECORD, model.getUserById("someid"));
    }

    @Test
    public void GetUserByUsernameTest() throws DatabaseException {
        assertEquals(MOCK_NULL_RECORD, model.getUserByUsername("someusername"));
    }

    @Test
    public void GetUserByUsernameNullTest() throws DatabaseException {
        MockUserSingleTableDatabase.mockRecord = MOCK_NULL_RECORD;
        assertEquals(MOCK_NULL_RECORD, model.getUserByUsername("someusername"));
    }

    @Test
    public void ChangeUserPasswordTest() throws DatabaseException {
        String newPw = "newpw";
        assertEquals(newPw, model.changeUserPassword("someid", newPw).getPassword());
    }

    @Test
    public void ChangeUserPasswordNullTest() throws DatabaseException {
        MockUserSingleTableDatabase.mockRecord = MOCK_NULL_RECORD;
        String newPw = "newpw";
        assertEquals(MOCK_NULL_RECORD, model.changeUserPassword("someid", newPw));
    }

    @Test
    public void ChangeUsernameTest() throws DatabaseException {
        String newUsername = "newuser";
        assertEquals(newUsername, model.changeUserUsername("someid", newUsername).getUsername());
    }

    @Test
    public void ChangeUsernameNullTest() throws DatabaseException {
        MockUserSingleTableDatabase.mockRecord = MOCK_NULL_RECORD;
        String newUsername = "newuser";
        assertEquals(MOCK_NULL_RECORD, model.changeUserUsername("someid", newUsername));
    }

    @Test
    public void DeleteUserTest() throws DatabaseException {
        assertEquals(MOCK_RECORD, model.deleteUser("somekey"));
    }

    @Test
    public void DeleteUserNullTest() throws DatabaseException {
        MockUserSingleTableDatabase.mockRecord = MOCK_NULL_RECORD;
        assertEquals(MOCK_NULL_RECORD, model.deleteUser("somekey"));
    }
}
