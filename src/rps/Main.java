package rps;

//Project imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rps.gui.ConsoleApp;
import rps.gui.JavaFXApp;



    public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("gui/view/GameView.fxml"));
            primaryStage.setTitle("Rock Paper Scissor");
            // primaryStage.setFullScreen(true);
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }
    }



