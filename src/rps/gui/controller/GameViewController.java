package rps.gui.controller;

// Java imports
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import rps.bll.game.Move;
import rps.bll.player.AI;
import rps.bll.player.Player;
import rps.gui.ConsoleApp;
import javafx.scene.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Timer;

/**
 *
 * @author smsj
 */
public class GameViewController implements Initializable {

 private AI ai = AI.getInstance();


   private ConsoleApp consoleApp;
   private Move move;
   private int gameRound = 0;

   @FXML
   private Label labelRound;
   @FXML
   private Label winLose;
    @FXML
    private Label cpuName;

    @FXML
    public Label playerName;

    @FXML
    private Label scoreCPU;

    @FXML
    private Label scoreP1;

    @FXML
    private Button btnPaper;

    @FXML
    private Button btnRock;

    @FXML
    private ImageView humRock;

    @FXML
    private ImageView humSci;

    @FXML
 private ImageView humPap;

    @FXML
 private ImageView cpuPap;

    @FXML
 private ImageView cpuRock;

 @FXML
 private ImageView cpuSci;




    @FXML
    private Button btnSci;

    private int p1Score = 0;

    private int cpuScore = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     winLose.setVisible(false);
     this.consoleApp = new ConsoleApp();
     String name = consoleApp.getRandomBotName();
     String pname = consoleApp.getRandomPlayerName();
     playerName.setText(pname);
     cpuName.setText(name);
     setImageOff();
    }

    public void setScoreP1(){
     p1Score = p1Score + 1;
     scoreP1.setText(p1Score + "");
 }
public void setGameRound(){

     gameRound = gameRound + 1;
     labelRound.setText("Round: " + gameRound);

    }
 public void setScoreCPU(){
  cpuScore = cpuScore + 1;
  scoreCPU.setText(cpuScore + "");
 }

 public void fillLabel(Label label, String text) {
  label.setVisible(true);
  label.setText(text);
 }

    public void handleRock(javafx.event.ActionEvent actionEvent) {
     //ai.simpleAIMove();
      Move aiMove = ai.AIMove();

      if (aiMove == Move.Rock) {
       setImageOff();
       resetLabel(winLose);
       fillLabel(winLose, "DRAW!");
       setGameRound();
       setImage(cpuRock);
       setImage(humRock);
       startLabelPulsating(winLose);
      }

      if (aiMove == Move.Scissor) {
       setImageOff();
       resetLabel(winLose);
       fillLabel(winLose, "YOU WIN!");
       setScoreP1();
       setImage(cpuSci);
       setImage(humRock);
       setGameRound();
       startLabelPulsating(winLose);
      }

     if (aiMove == Move.Paper) {
      setImageOff();
      resetLabel(winLose);
      fillLabel(winLose, "YOU LOSE!");
      setScoreCPU();
      setImage(cpuPap);
      setImage(humRock);
      setGameRound();
      startLabelPulsating(winLose);
     }

    }

    public void handlePaper(ActionEvent actionEvent) {
        //ai.simpleAIMove();
        Move aiMove = ai.AIMove();

        if (aiMove == Move.Rock) {
      setImageOff();
      resetLabel(winLose);
      fillLabel(winLose, "YOU WIN!");
      setScoreP1();
      setGameRound();
      setImage(cpuRock);
      setImage(humPap);
      startLabelPulsating(winLose);
     }

     if (aiMove == Move.Scissor) {
      setImageOff();
      resetLabel(winLose);
      fillLabel(winLose, "YOU LOSE!");
      setScoreCPU();
      setImage(cpuSci);
      setImage(humPap);
      setGameRound();
      startLabelPulsating(winLose);

     }

     if (aiMove == Move.Paper) {
      setImageOff();
      resetLabel(winLose);
      fillLabel(winLose, "DRAW!");
      setGameRound();
      setImage(cpuPap);
      setImage(humPap);
      startLabelPulsating(winLose);
     }
    }

    public void handleSci(ActionEvent actionEvent) {
        //ai.simpleAIMove();
        Move aiMove = ai.AIMove();


     if (aiMove == Move.Rock) {
      setImageOff();
      resetLabel(winLose);
      fillLabel(winLose, "YOU LOSE!");
      setScoreCPU();
      setGameRound();
      setImage(cpuRock);
      setImage(humSci);
      startLabelPulsating(winLose);

     }

     if (aiMove == Move.Scissor) {
      setImageOff();
      resetLabel(winLose);
      fillLabel(winLose, "DRAW!");
      setGameRound();
      setImage(cpuSci);
      setImage(humSci);
      startLabelPulsating(winLose);



     }

     if (aiMove == Move.Paper) {
      setImageOff();
      resetLabel(winLose);
      fillLabel(winLose, "YOU WIN!");
      setScoreP1();
      setGameRound();
      setImage(cpuPap);
      setImage(humSci);
      startLabelPulsating(winLose);
     }
    }

 private void startLabelPulsating(Label label) {
  ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(1), label);
  scaleTransition.setToX(1.2);
  scaleTransition.setToY(1.2);
  scaleTransition.setAutoReverse(true);
  scaleTransition.setCycleCount(Timeline.INDEFINITE);
  scaleTransition.play();
  label.setUserData(scaleTransition);

  PauseTransition pauseTransition = new PauseTransition(Duration.seconds(5));
  pauseTransition.setOnFinished(event -> {
   scaleTransition.stop();
  });
  pauseTransition.play();
 }

 public void resetLabel(Label label){
  label.setScaleX(1);
  label.setScaleY(1);
  label.setVisible(false);
 }

 public void handleReset(ActionEvent actionEvent) {
     gameRound = 0;
     cpuScore = 0;
     p1Score = 0;
     labelRound.setText("Round: 0");
     scoreCPU.setText("" + 0);
     scoreP1.setText("" + 0);
     winLose.setVisible(false);
     setImageOff();
 }

 public void setImageOff(){
     humPap.setVisible(false);
     humRock.setVisible(false);
     humSci.setVisible(false);
     cpuPap.setVisible(false);
     cpuRock.setVisible(false);
     cpuSci.setVisible(false);
 }

 public void setImage(ImageView imageview){
     imageview.setVisible(true);
 }
}
