// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

public class MatrixSearch {

    static boolean searchInMatrix(int matrix[][], int target) {

        int row = matrix.length-1;

        for (int i = 1; i < matrix.length; i++) {

            if (target < matrix[i][0]) {
                row = i - 1;
                break;
            }
        }

        for (int j = 0; j < matrix.length; j++) {
            if (target == matrix[row][j]) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }

        };
        int target = 34;

        System.out.println(searchInMatrix(matrix, target));
    }

}
