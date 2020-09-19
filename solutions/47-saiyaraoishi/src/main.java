import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class main extends Application {
    public main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        {
            Parent root;
            root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);


            primaryStage.setTitle("tic tac toe");
            primaryStage.show();
        }
    }
}