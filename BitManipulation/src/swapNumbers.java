import java.util.Scanner;

public class swapNumbers {

    static class pair {
        int a;
        int b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        pair p = new pair();
        p.a = s.nextInt();
        p.b = s.nextInt();

        System.out.println("The numbers before swapping: a -> " + p.a + " b -> " + p.b);
        swapNums (p);
        System.out.println("The numbers after swapping: a -> " + p.a + " b -> " + p.b);
    }

    public static void swapNums(pair p) {
        p.a = p.a ^ p.b;
        p.b = p.a ^ p.b;
        p.a = p.a ^ p.b;
    }
}
