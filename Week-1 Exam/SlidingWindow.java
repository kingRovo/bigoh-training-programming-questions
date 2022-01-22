public class SlidingWindow {

    static int[] MaxValues(int arr[], int k) {
        if (k > arr.length)
            return null;

        int result[] = new int[arr.length-k+1];
        int index = 0;
        int max = 0;


        for (int i = 0; i <= arr.length-k; i++) {

            for (int j = 0; j < k; j++) {
                
                if (j < arr.length) {
                    if (arr[i + j] > max)
                        max = arr[i + j];

                }
                
            }
            result[index++] = max;

            
        }

        return result;

    }

    public static void main(String[] args) {
        int arr[] = {5,3,7,9,1,6,9,2};
        int k = 2;
        
        
        int reslt[] = MaxValues(arr,k);

        for (int i = 0; i < reslt.length; i++) {
         
            System.out.print(reslt[i]+" ");
        }
        

    }
}
