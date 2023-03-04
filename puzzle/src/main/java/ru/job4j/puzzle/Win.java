package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (HasWinHorizontal(board) || HasWinVertical(board)) {rsl = true;}
        return rsl;
    }

    public static boolean HasWinHorizontal(int [][] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            rsl = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 1) {
                    rsl = false;
                }
            }
            if (rsl == true) {
                break;
            }
        }
        return  rsl;
    }

    public static boolean HasWinVertical(int [][] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            rsl = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] != 1) {
                    rsl = false;
                }
            }
            if (rsl == true) {
                break;
            }
        }
        return  rsl;
    }
}


