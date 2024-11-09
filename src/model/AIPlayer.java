package model;

import java.util.Random;

public class AIPlayer {
    private char symbol;
    private Random random = new Random();

    public AIPlayer(char symbol) {
        this.symbol = symbol;
    }

    public int getMove(Board board) {
        char[] currentBoard = board.getBoard();
        int move;
        do {
            move = random.nextInt(9);
        } while (currentBoard[move] != ' ');
        return move;
    }
}