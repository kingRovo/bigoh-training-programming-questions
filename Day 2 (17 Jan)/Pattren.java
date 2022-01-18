//iii) Write a program to print the below pattern
//        \*****/ 1
//        *\***/* 2
//        **\*/** 3
//        ***/*** 4
//        **/*\** 5
//        */***\* 6
//        /*****\ 7


public class Pattren {
    

    static void printPattren(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (i==j &&i!=(n/2)+1) {
                    System.out.print("\\ ");
                }
                 else if(j==n-i+1) System.out.print("/ ");
                 else System.out.print("* ");
               
              

            }
            System.out.println(" ");
        }
    
    }
    public static void main(String[] args) {
        
        int n = 7;

        printPattren(n);
    }
  

}
