package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        String result = winningMove;
        if(handSign == "rock") {
             winningMove = "paper";
        }
        if(handSign == "paper"){
            winningMove =  "scissor";
        }
        if(handSign == "scissor")
            winningMove = "rock";


        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove = "";
        String result = losingMove;
        if(handSign == "rock"){
            losingMove = "scissor";
        }
        if(handSign == "paper"){
            losingMove = "scissor";
        }
        if(handSign == "scissor"){
            losingMove = "rock";
        }

        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
       String winner = "";

        if(handSignOfPlayer1 != handSignOfPlayer2){
           getWinningMove(handSignOfPlayer1);
           getWinningMove(handSignOfPlayer2);
           System.out.println(getWinningMove(handSignOfPlayer1));
           System.out.println(getWinningMove(handSignOfPlayer2));
       }

        return winner;
    }
}
