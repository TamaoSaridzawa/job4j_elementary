package ru.job4j.array;

public class MatrixCheck {
    public static boolean momoHorizontal(char[][] board, int row) {
        boolean res = true;
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 'X') {
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = column; j <= column; j++) {
                if (board[i][j] != 'X') {
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    public  static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (momoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
