package UI;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.github.npathai.hamcrestopt.OptionalMatchers.*;

import static org.testfx.api.FxAssert.verifyThat;

@ExtendWith(ApplicationExtension.class)
class LoginViewTest {
    private Stage stage;

    private LoginView view;

    private boolean loginSucceeded = false;

    private static String origFile;

    @BeforeAll
    public static void init() throws FileNotFoundException {
        StringBuilder origFile = new StringBuilder();
        Scanner myReader = new Scanner(new File("src/main/resources/userdb.json"));
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            origFile.append(data);
        }
        myReader.close();
        LoginViewTest.origFile = origFile.toString();
    }

    @Start
    public void start(Stage stage) {
        this.stage = stage;
        Platform.runLater(() -> {
            view = new LoginView();
            view.setOnLoginSuccessful((event) -> loginSucceeded = true);
            stage.setScene(new Scene(view));
            stage.show();
            stage.toFront();
        });
    }

    @BeforeEach
    public void setUp() {
        loginSucceeded = false;
    }

    @AfterEach
    public void tearDown() throws IOException {
        Platform.runLater(() -> stage.hide());

        FileWriter myWriter = new FileWriter("src/main/resources/userdb.json", false);
        myWriter.write(origFile);
        myWriter.close();
    }

    @Test
    public void should_have_username_label(FxRobot robot) {
        verifyThat("#usernameLabel", LabeledMatchers.hasText("Username"));
    }

    @Test
    public void should_display_warning_modal(FxRobot robot) {
        verifyThat("#loginButton", LabeledMatchers.hasText("Login"));

        robot.clickOn("#loginButton");

        Node modalPane = robot.lookup(".dialog-pane").query();
        var text = robot.from(modalPane).lookup((Text t) -> t.getText().contains("incorrect"));
        verifyThat(text.tryQuery(), isPresent());

        robot.clickOn("OK");
    }

    @Test
    public void should_display_warning_modal_if_username_is_wrong(FxRobot robot) {
        robot.clickOn("#usernameTF").write("notusername");
        robot.clickOn("#passwordTF").write("password");

        robot.clickOn("#loginButton");

        Node modalPane = robot.lookup(".dialog-pane").query();
        var text = robot.from(modalPane).lookup((Text t) -> t.getText().contains("incorrect"));
        verifyThat(text.tryQuery(), isPresent());

        robot.clickOn("OK");
    }

    @Test
    public void should_display_warning_modal_if_password_is_wrong(FxRobot robot) {
        robot.clickOn("#usernameTF").write("user1");
        robot.clickOn("#passwordTF").write("password");

        robot.clickOn("#loginButton");

        Node modalPane = robot.lookup(".dialog-pane").query();
        var text = robot.from(modalPane).lookup((Text t) -> t.getText().contains("incorrect"));
        verifyThat(text.tryQuery(), isPresent());

        robot.clickOn("OK");
    }

    @Test
    public void should_successfully_login(FxRobot robot) {
        robot.clickOn("#usernameTF").write("user1");
        robot.clickOn("#passwordTF").write("password1");

        robot.clickOn("#loginButton");

        assertTrue(loginSucceeded);
    }

    @Test
    public void should_call_handler_on_successful_login(FxRobot robot) {
        view.setOnLoginSuccessful((event) -> this.loginSucceeded = true);
        robot.clickOn("#usernameTF").write("user1");
        robot.clickOn("#passwordTF").write("password1");

        robot.clickOn("#loginButton");

        assertTrue(loginSucceeded);
    }

    @Test
    public void should_display_error_modal(FxRobot robot) throws IOException {
        FileWriter myWriter = new FileWriter("src/main/resources/userdb.json", false);
        myWriter.write("illegaltext" + origFile);
        myWriter.close();

        robot.clickOn("#usernameTF").write("user1");
        robot.clickOn("#passwordTF").write("password");

        robot.clickOn("#loginButton");

        Node modalPane = robot.lookup(".dialog-pane").query();
        var text = robot.from(modalPane).lookup((Text t) -> t.getText().contains("exception"));
        verifyThat(text.tryQuery(), isPresent());

        robot.clickOn("OK");
    }
}