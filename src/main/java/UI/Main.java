package UI;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;

    private void showLoginScene() {
        LoginView loginView = new LoginView();
        loginView.setOnLoginSuccessful(this::loginSucceeded);

        stage.setMinHeight(400);
        stage.setMaxHeight(400);
        stage.setMinWidth(600);
        stage.setMaxWidth(600);

        Scene loginScene = new Scene(loginView);
        stage.setScene(loginScene);
        stage.show();
    }

    private void showChartGridScene() {
        ChartGridPane chartGridView = new ChartGridPane();
        stage.setMaxHeight(Screen.getPrimary().getBounds().getHeight());
        stage.setMaxWidth(Screen.getPrimary().getBounds().getWidth());

        Scene chartGridScene = new Scene(chartGridView);
        stage.setScene(chartGridScene);
        stage.setMinWidth(1280);
        stage.setMinHeight(720);
        stage.setWidth(1280);
        stage.setHeight(720);
        stage.show();
    }

    public void loginSucceeded(Event event) {
        System.out.println("Login successful!");
        try {
            showChartGridScene();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        showLoginScene();
    }

    public static void main(String[] args) {
        launch(args);
    }
}