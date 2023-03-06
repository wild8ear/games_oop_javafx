package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && (hasWinHorizontal(board, index)
                    || hasWinVertical(board, index))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean hasWinHorizontal(int[][] array, int row) {
        boolean rsl = true;
        for (int index = 0; index < array[row].length; index++) {
            if (array[row][index] != 1) {
                rsl = false;
                break;
            }
        }
        return  rsl;
    }

    public static boolean hasWinVertical(int[][] array, int column) {
        boolean rsl = true;
        for (int index = 0; index < array.length; index++) {
            if (array[index][column] != 1) {
                rsl = false;
                break;
            }
        }
        return  rsl;
    }
}


