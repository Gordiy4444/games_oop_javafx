package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {

                result = false;

                break;
            }
        }


        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {

            if (board[i][column] != 1) {
                result = false;
                break;

            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean result = false;
        for (int m = 0; m < board.length; m++) {
            if (board[m][m] == 1) {
                if (monoHorizontal(board, m) || monoVertical(board, m)) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
}