// Find the largest number less than N whose each digit is prime number
public class IsPrimeAllDigit {

    static boolean isPrime(int n) {
        boolean f = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                f = false;

        }

        return f ? true : false;

    }

    static boolean findDigits(int n) {
        boolean flg = true;
        while (n > 0) {
            int dgt = n % 10;
            if (!isPrime(dgt)) {
                flg = false;
            }
            n = n / 10;
        }
        return flg;
    }

    public static void main(String[] args) {


        int n = 145;

        for (int i = n; i > 10; i--) {

            if (findDigits(i)) {
                System.out.println("Largest Number with prime digits is : " + i);
                break;
            }
        }
    }

}
