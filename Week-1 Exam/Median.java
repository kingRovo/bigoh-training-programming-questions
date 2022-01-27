import java.util.*;

public class Median {

    static double FindMedian(int arr1[],int arr2[])
    {
     
        int n1 = arr1.length;
        int n2 = arr2.length;
        int resultArr[] = new int[n1 + n2];
  
  
        int i = 0, j = 0;
  
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                resultArr[k] = arr1[i];
                i++;
            }
            else {
                resultArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            resultArr[k] = arr1[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            resultArr[k] = arr2[j];
            j++;
            k++;
        }

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