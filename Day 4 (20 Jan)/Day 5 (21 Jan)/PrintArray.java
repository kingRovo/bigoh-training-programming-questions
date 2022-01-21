
public class PrintArray {

    static void printClockWise(int arr[][]) {

       

        int rowIndex = 0, colIndex = 0;
        int arrSize = arr.length;
        while (rowIndex != 1 && colIndex != 1) {
            System.out.println(rowIndex+" --- "+colIndex);
            if (rowIndex == 0 && colIndex < arrSize)
                System.out.print(arr[rowIndex][colIndex++]);

            if (colIndex == arrSize - 1 && rowIndex < arrSize)
                System.out.println(arr[rowIndex++][colIndex]);

            if (colIndex == arrSize - 1 && rowIndex == arrSize - 1 && colIndex > -1)
                System.out.println(arr[rowIndex][colIndex--]);

            if (rowIndex == arrSize -1 && colIndex==0&&rowIndex>0)
                System.out.println(arr[rowIndex--][colIndex]);
            else System.out.println(arr[rowIndex][--colIndex]);

        }

    }

    static void printAntiClockWise(int arr[][]) {

    }

    public static void main(String[] args) {
        int givenArray[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printAntiClockWise(givenArray);
        printClockWise(givenArray);

    }

}
