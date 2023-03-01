package rps.gui.controller;

// Java imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import rps.bll.game.Move;
import rps.bll.player.Player;
import rps.gui.ConsoleApp;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author smsj
 */
public class GameViewController implements Initializable {



   private ConsoleApp consoleApp;
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
 private Label answer;

    @FXML
    private Button btnSci;
 @FXML
 private ImageView aiHand;

 @FXML
 private ImageView playerHand;

    private int scoreInt = 0;
    public String opponentMove = "";





    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
public void opponentMove(){

     int rand =(int)(Math.random() * 3);
     if (rand == 0) {
      opponentMove = "Rock";
      Image rockHandAi = new Image(getClass().getResourceAsStream("/img/rock.PNG"));
      aiHand.setImage(rockHandAi);
     }
      else if(rand == 1) {
      opponentMove = "Paper";
      Image paperHandAi = new Image(getClass().getResourceAsStream("/img/paper.PNG"));
      aiHand.setImage(paperHandAi);
     }
      else {
       opponentMove = "Scissors";
       Image scissorHandAi = new Image(getClass().getResourceAsStream("/img/scissors.PNG"));
       aiHand.setImage(scissorHandAi);


     }


}



    public void handleRock(ActionEvent actionEvent) {

     Image rockImage = new Image(getClass().getResourceAsStream("/img/rock.PNG"));
     playerHand.setImage(rockImage);
     opponentMove();
     if (opponentMove.equals("Scissors")){
      answer.setText("YOU WON");
      scoreInt += 1;
      scoreP1.setText(Integer.toString(scoreInt));
     }
     else if (opponentMove.equals("Rock")) {
      answer.setText("IT'S A TIE");
     }
     else {
      answer.setText("YOU LOSE");
      scoreInt += 1;
      scoreCPU.setText(Integer.toString(scoreInt));
     }


    }

    public void handlePaper(ActionEvent actionEvent) {
     Image paperImage = new Image(getClass().getResourceAsStream("/img/paper.PNG"));
     playerHand.setImage(paperImage);
     opponentMove();
     if (opponentMove.equals("Rock")) {
      answer.setText("YOU WON");
      scoreInt += 1;
      scoreP1.setText(Integer.toString(scoreInt));
     } else if (opponentMove.equals("Paper")) {
      answer.setText("IT'S A TIE");
     } else {
      answer.setText("YOU LOSE");
      scoreInt += 1;
      scoreCPU.setText(Integer.toString(scoreInt));
     }
    }

     public void handleScissor(ActionEvent actionEvent) {
      Image scissorImage = new Image(getClass().getResourceAsStream("/img/scissors.PNG"));
      playerHand.setImage(scissorImage);
      opponentMove();
      if (opponentMove.equals("Paper")){
       answer.setText("YOU WON");
       scoreInt += 1;
       scoreP1.setText(Integer.toString(scoreInt));
      }
      else if (opponentMove.equals("Scissor")) {
       answer.setText("IT'S A TIE");
      }
      else {
       answer.setText("YOU LOSE");
       scoreInt += 1;
       scoreCPU.setText(Integer.toString(scoreInt));
      }



     }

    }



