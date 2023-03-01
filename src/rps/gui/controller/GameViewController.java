package rps.gui.controller;

// Java imports
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author smsj
 */
public class GameViewController implements Initializable {

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

    @FXML
    void handlePaper(ActionEvent event) {

    }

    @FXML
    void handleRock(ActionEvent event) {

    }

    @FXML
    void handleSci(ActionEvent event) {

    }



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
