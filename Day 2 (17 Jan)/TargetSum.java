// ii) Write a function that takes in a non-empty array of distinct integers and an 
// integer representing a target sum. 
// The function should find all triplets in the array that sum up to the target sum 
// and return a two-dimensional array of all these triplets. 
// The numbers in each triplet should be ordered in ascending order, 
// and the triplets themselves should be ordered in ascending order with respect to the numbers they hold. 
// If no three numbers sum up to the target sum, the function should return an empty array
import java.util.*;

class TargetSum {
    static int[][] findTriplets(int[] arr, int n, int sum) {
        Arrays.sort(arr);
        
        int matrix[][] = new int[3][3];
        int index1=0;
        for (int i = 0; i < n - 1; i++) {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == sum) {

                    
                    matrix[index1][0] = x;
                    matrix[index1][1] = arr[l];
                    matrix[index1][2] = arr[r];
                    index1++;  
                    l++;
                    r--;
                }

                else if (x + arr[l] +
                        arr[r] < sum)
                    l++;

                else
                    r--;
            }
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        return matrix;
    }

    public static void main(String args[]) {
        int[] arr = new int[] { 1, 2, 3, 5, 6, 8 };
        int sum = 9;
        int n = arr.length;
        int size = findTriplets(arr, n, sum).length;
        
        // for (int i = 0; i < size; i++) {
        //     for (int j = 0; j < 3; j++) {
                
        //         System.out.print(findTriplets(arr, n, sum)[i][j]+" ");
        //     }
        //     System.out.println(" ");
        // }


    }
}