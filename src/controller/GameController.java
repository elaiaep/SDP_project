package controller;

import model.Board;
import model.AIPlayer;
import view.View;

public class GameController {
    private Board board;
    private View view;
    private AIPlayer ai;
    private char currentPlayer = 'X';

    public GameController() {
        board = new Board();
        view = new View();
        ai = new AIPlayer('O');
    }

    public void play() {
        while (!board.isFull()) {
            board.display();
            if (currentPlayer == 'X') {
                int move = view.getInput();
                if (board.update(move, currentPlayer)) {
                    if (board.checkWinner(currentPlayer)) {
                        view.showMessage("Победил игрок!");
                        break;
                    }
                    currentPlayer = 'O';
                }
            } else {
                int move = ai.getMove(board);
                board.update(move, currentPlayer);
                if (board.checkWinner(currentPlayer)) {
                    view.showMessage("Победил ИИ!");
                    break;
                }
                currentPlayer = 'X';
            }
        }
        board.display();
        view.showMessage("Игра окончена.");
    }
}