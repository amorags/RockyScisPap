package rps.gui.controller;

// Java imports
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author smsj
 */
public class GameViewController implements Initializable {

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
