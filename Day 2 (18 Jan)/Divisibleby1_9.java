
//iv) Write a program to find the smallest number divisible by all the numbers between 1 to 9.

public class Divisibleby1_9 {
        
static int gcd(int a, int b)
{
   if(a%b != 0) 
      return gcd(b,a%b);
   else 
      return b;
}

static int lcm(int n)
{
    int rslt = 1;    
    for (int i = 1; i <= n; i++)
        rslt = (rslt * i)/(gcd(rslt, i));
    return rslt;
}

    public static void main(String arg[]) {

        int n = 9;
        System.out.println("the number is " + lcm(n));
    }
}
