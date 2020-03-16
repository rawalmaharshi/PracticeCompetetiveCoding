import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int sum = 0;
        int prev = map.get(s.charAt(0));
        int curr = 0;

        for (int i  = 1; i < s.length(); i++) {
            curr = map.get(s.charAt(i));

            if (prev < curr) {
                sum -= prev;
            } else {
                sum += prev;
            }

            prev = curr;
        }
        sum += prev;
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str + " in integer is: " + romanToInt(str));
        s.close();
    }
}
