import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        public void start (Stage primaryStage) throws IOException {

            Parent root;
            root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
            Scene scean = new Scene(root);
            primaryStage.setScene(scean);


            primaryStage.setTitle("tictactoe");
            primaryStage.show();
        }
    }
}