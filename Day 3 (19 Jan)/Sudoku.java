// i) Write a method Boolean isValidSudoku(int[][]Sudoku)
// Returns true if the given Sudoku is correctly arranged otherwise false

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
// 1. Each row must contain the digits 1-9 without repetition.
// 2. Each column must contain the digits 1-9 without repetition.
// 3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

public class Sudoku {
    static boolean isValidSudoku(int[][] sudoku) {
        int rowDgt, clmDgt;
        boolean flg=true;
        for (int i = 0; i < sudoku.length; i++) {
            rowDgt = -1;
            clmDgt = -1;
            for (int j = 0; j < sudoku.length; j++) {

                if (sudoku[i][j] == rowDgt) {
                    flg =  false;

                } else if (sudoku[i][j] > 0) {
                    rowDgt = sudoku[i][j];
                } else
                    continue;

                for (int k = i; k < sudoku.length; k++) {

                    if (sudoku[k][j] == clmDgt)
                        flg =  false;

                    else if (sudoku[k][j] > 0) {
                        clmDgt = sudoku[i][j];
                    }
                }

                if (i % 3 != 0 && j % 3 != 0) {

                    

                }
            }

        }

        return flg;
    }

    public static void main(String[] args) {
        int sudoku[][] = new int[][] { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 3, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        System.out.println(isValidSudoku(sudoku));
    }
}
