import java.util.Scanner;

public class addTwoNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        int sum = addNums (a, b);
        System.out.println("The sum is: " + sum);
    }
    
    public static int addNums(int a, int b) {
        int hld = 0;
        while (b != 0) {
            hld = a & b;
            a = a ^ b;
            b = hld << 1;
        }
        return a;
    }
}
