import javafx.application.Application;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;


public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(@NotNull Stage primaryStage) {
        primaryStage.setTitle("tictactoe");
        primaryStage.show();

    }

}
