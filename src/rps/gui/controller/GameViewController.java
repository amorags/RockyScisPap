package rps.gui.controller;

// Java imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import rps.gui.ConsoleApp;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;

/**
 *
 * @author smsj
 */
public class GameViewController implements Initializable {

   private ConsoleApp consoleApp;

   @FXML
   private Label winLose;
    @FXML
    private Label cpuName;

    @FXML
    private Label playerName;

    @FXML
    private Label scoreCPU;

    @FXML
    private Label scoreP1;

    @FXML
    private Button btnPaper;

    @FXML
    private Button btnRock;

    @FXML
    private Button btnSci;





    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     winLose.setVisible(false);
     this.consoleApp = new ConsoleApp();
     String name = consoleApp.getRandomBotName();
     cpuName.setText(name);
    }

    public void handleRock(javafx.event.ActionEvent actionEvent) throws InterruptedException {
      winLose.setVisible(true);
      wait(50);
      winLose.setVisible(false);

    }

    public void handlePaper(ActionEvent actionEvent) {
    }

    public void handleSci(ActionEvent actionEvent) {

    }
}
