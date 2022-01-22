import java.util.*;

public class Median {

    static double FindMedian(int arr1[], int arr2[]) {

        int m = arr1.length;
        int n = arr2.length;
        int resultArr[] = new int[m + n];
        int count = 0;

        for (int i = 0; i < arr1.length; i++)
            resultArr[count++] = arr1[i];

        for (int j = 0; j < arr2.length; j++)
            resultArr[count++] = arr2[j];

        Arrays.sort(resultArr);

        if (resultArr.length % 2 != 0) {
            return resultArr[resultArr.length / 2];
        } else

            return ((double) resultArr[resultArr.length / 2] + (double) resultArr[resultArr.length / 2 - 1]) / 2;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2 };
        int arr2[] = { 3, 4 };

        System.out.println(FindMedian(arr1, arr2));

    }

}