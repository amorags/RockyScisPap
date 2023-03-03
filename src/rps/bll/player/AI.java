package rps.bll.player;

import rps.bll.game.*;

import java.util.ArrayList;
import java.util.Collections;

public class AI {

    private static AI instance;

    private static int rock, scissor, paper;
    private static Move lastMove = simpleAIMove();
    private  static  ArrayList<Move> moves ;
    private AI(){
        rock = 0;
        paper = 0;
        scissor = 0;
    }

    public static AI getInstance(){
        if (instance == null){
            instance = new AI();
        }
        return instance;
    }

    public static Move AIMove(){
        switch (lastMove){
            case Rock:
                moves = new ArrayList<>();
                moves.add(Move.Paper);
                moves.add(Move.Paper);
                moves.add(Move.Scissor);
                moves.add(Move.Scissor);
                moves.add(Move.Rock);
                Collections.shuffle(moves);
                lastMove = moves.get(0);
                return lastMove;
            case Scissor:
                moves = new ArrayList<>();
                moves.add(Move.Paper);
                moves.add(Move.Paper);
                moves.add(Move.Scissor);
                moves.add(Move.Rock);
                moves.add(Move.Rock);
                Collections.shuffle(moves);
                lastMove = moves.get(0);
                return lastMove;
            case Paper:
                moves = new ArrayList<>();
                moves.add(Move.Paper);
                moves.add(Move.Scissor);
                moves.add(Move.Scissor);
                moves.add(Move.Rock);
                moves.add(Move.Rock);
                Collections.shuffle(moves);
                lastMove = moves.get(0);
                return lastMove;
            default:
                lastMove = simpleAIMove();
                return lastMove;
        }
    }
    public static Move simpleAIMove(){
        ArrayList<Move> moves = new ArrayList<>();
        moves.add(Move.Paper);
        moves.add(Move.Scissor);
        moves.add(Move.Rock);
        Collections.shuffle(moves);
        return moves.get(0);
    }
}
