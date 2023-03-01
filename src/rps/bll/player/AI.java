package rps.bll.player;

import rps.bll.game.*;

import java.util.ArrayList;
import java.util.Collections;

public class AI {


    public static Move simpleAIMove(){
        ArrayList<Move> moves = new ArrayList<>();
        moves.add(Move.Paper);
        moves.add(Move.Scissor);
        moves.add(Move.Rock);
        Collections.shuffle(moves);
        return moves.get(0);
    }
}
