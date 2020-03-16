import java.util.Scanner;

public class Pow {
    public static double myPow(double x, int n) {
        //base case
        if (n == 0) {
            return 1;
        }

        //for negative power
        if (n < 0) {
            n = n - 2*n;    //Instead of Math.abs
            x = (1/x);
        }

        return (n % 2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        int n = s.nextInt();
        System.out.println(myPow(x, n));
    }
}
