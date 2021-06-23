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
}
