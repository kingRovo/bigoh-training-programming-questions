

import java.util.*;

class test {

    static boolean forRow(int matrix[][], int row) {

        HashSet<Integer> uniqueRow = new HashSet<>();

        for (int i = 0; i < 9; i++) {

            if (uniqueRow.contains(matrix[row][i]))
                return false;
            if (matrix[row][i] != 0)
            uniqueRow.add(matrix[row][i]);
        }
        return true;
    }

    public static boolean forCol(int matrix[][], int col) {
        HashSet<Integer> uniqueCol = new HashSet<>();

        for (int i = 0; i < 9; i++) {

            if (uniqueCol.contains(matrix[i][col]))
                return false;

            if (matrix[i][col] != 0)
            uniqueCol.add(matrix[i][col]);
        }
        return true;
    }

    public static boolean subBox(int matrix[][], int rowIndex,int colIndex) {

        HashSet<Integer> uniqueBox = new HashSet<>();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int flg = matrix[row + rowIndex][col + colIndex];

                if (uniqueBox.contains(flg))
                    return false;
                if (flg != 0)
                   uniqueBox.add(flg);
            }
        }
        return true;
    }

    static boolean cheackSudoku(int matrix[][], int row,int col) {

        return forRow(matrix, row) && forCol(matrix, col) && subBox(matrix, row - row % 3, col - col % 3);
    }

    static boolean isValidSudoku(int matrix[][]) {
        int n=9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                    if(!cheackSudoku(matrix, i, j)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
                { 6, 0, 0, 1, 9, 0, 0, 0, 0 }, 
                { 0, 1, 8, 0, 0, 0, 0, 9, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, 
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, 
                { 0, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, 
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, 
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        System.out.println((isValidSudoku(board) ? "True" : "False"));
    }
}
