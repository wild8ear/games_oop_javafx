package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (hasWinHorizontal(board) || hasWinVertical(board)) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean hasWinHorizontal(int[][] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            rsl = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 1) {
                    rsl = false;
                }
            }
            if (rsl) {
                break;
            }
        }
        return  rsl;
    }

    public static boolean hasWinVertical(int[][] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            rsl = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] != 1) {
                    rsl = false;
                }
            }
            if (rsl) {
                break;
            }
        }
        return  rsl;
    }
}


