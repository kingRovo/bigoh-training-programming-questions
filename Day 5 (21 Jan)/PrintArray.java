// Write a method void printArray(int[][]arr)
// Prints array elements clock wise and anti-clockwise alternatively.
public class PrintArray {

    static void printClockWise(int arr[][]) {

        int rowLength = arr.length;
        int colLength = arr.length;

		 int colStartIndex = 0, rowStartIndex = 0;

		int visited = 0;
		int totalElement = rowLength * colLength;

		while (colStartIndex < rowLength && rowStartIndex < colLength)
		{
            int i;
			if (visited == totalElement)
				break;


			for (i = rowStartIndex; i < colLength; i++)
			{
				System.out.print(arr[colStartIndex][i] + " ");
				visited++;
			}
			colStartIndex++;

			if (visited == totalElement)
				break;

			for (i = colStartIndex; i < rowLength; i++)
			{
				System.out.print(arr[i][colLength - 1] + " ");
				visited++;
			}
			colLength--;

			if (visited == totalElement)
				break;

		
			if (rowStartIndex < colLength)//for row
			{
				for (i = colLength - 1; i >= rowStartIndex; i--)
				{
					System.out.print(arr[rowLength - 1][i] + " ");
					visited++;
				}
				rowLength--;
			}

			if (visited == totalElement)
				break;

			
			if (colStartIndex < rowLength) //for columns
			{
				for (i = rowLength - 1; i >= colStartIndex; i--)
				{
					System.out.print(arr[i][rowStartIndex] + " ");
					visited++;
				}
				rowStartIndex++;
			}
		}
	}

    
    static void printAntiClockWise(int arr[][]) {

        int visited = 0;
        int rowLength = arr.length;
        int colLength = arr.length;
        int totalElement = rowLength * colLength;

        int colStartIndex = 0, rowStartIndex = 0;

        while (colStartIndex < rowLength && rowStartIndex < colLength) {
            int i;
            if (visited == totalElement)
                break;

            for (i = colStartIndex; i < rowLength; i++) {
                System.out.print(arr[i][rowStartIndex] + " ");
                visited++;
            }
            rowStartIndex++;

            if (visited == totalElement)
                break;

            for (i = rowStartIndex; i < colLength; i++) {
                System.out.print(arr[rowLength - 1][i] + " ");
                visited++;
            }
            rowLength--;

            if (visited == totalElement)
                break;

            if (colStartIndex < rowLength) // for columns
            {
                for (i = rowLength - 1; i >= colStartIndex; i--) {
                    System.out.print(arr[i][colLength - 1] + " ");
                    visited++;
                }
                colLength--;
            }

            if (visited == totalElement)
                break;

            if (rowStartIndex < colLength) // for rows
            {
                for (i = colLength - 1; i >= rowStartIndex; i--) {
                    System.out.print(arr[colStartIndex][i] + " ");
                    visited++;
                }
                colStartIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int givenArray[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.print("Clock Wise : ");
        printClockWise(givenArray);
        System.out.print("\nAnti Clock Wise : ");
        printAntiClockWise(givenArray);
        

    }

}
