package model;

public class Board {
    private char[] board;
    private static final int SIZE = 9;

    public Board() {
        board = new char[SIZE];
        for (int i = 0; i < SIZE; i++) {
            board[i] = ' ';
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i += 3) {
            System.out.println(board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
            if (i < 6) System.out.println("--|---|--");
        }
    }

    public boolean update(int index, char symbol) {
        if (index >= 0 && index < SIZE && board[index] == ' ') {
            board[index] = symbol;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (char c : board) {
            if (c == ' ') return false;
        }
        return true;
    }

    public boolean checkWinner(char symbol) {
        int[][] winCombinations = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };
        for (int[] combo : winCombinations) {
            if (board[combo[0]] == symbol && board[combo[1]] == symbol && board[combo[2]] == symbol) {
                return true;
            }
        }
        return false;
    }

    public char[] getBoard() {
        return board;
    }
}