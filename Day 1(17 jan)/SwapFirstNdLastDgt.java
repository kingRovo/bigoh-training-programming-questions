// Write a program (without using inbuilt functions and not using Strings or array) 
// to swap first and last digits of any number

class SwapFirstNdLastDgt {
    public static int swapNum(int n) {

        int frstDgt, lstDgt, digits;
        int tmp;
        lstDgt = n % 10;
        digits = (int) (Math.log10(n));
        frstDgt = (int) (n / Math.pow(10, digits));

        tmp = lstDgt;
        tmp *= (int) Math.pow(10, digits);
        tmp += n % ((int) Math.pow(10, digits));
        tmp -= lstDgt;
        tmp += frstDgt;

        return tmp;
    }

    public static void main(String arg[]) {

        System.out.print(swapNum(10006));

    }

}