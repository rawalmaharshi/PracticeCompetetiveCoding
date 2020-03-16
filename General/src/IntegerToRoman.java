import java.util.HashMap;
import java.util.Scanner;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<Integer, String>() {{
            put(1, "I");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
            put(500, "D");
            put(1000, "M");
        }};

        int numDigits = (int) Math.log10(1.0 * num) + 1;
        String roman = "";

        for (int i = 1; i <= numDigits; i++) {
            int place = (int) Math.pow(10, numDigits - i);
            int currNum = num/place;

            if (currNum == 4) {
                roman += map.get(place);
                roman += map.get(place * 5);
            } else if (currNum == 9) {
                roman += map.get(place);
                roman += map.get(place * 10);
            } else {
                //For numbers between 5 and 8
                if (currNum > 4) {
                    roman += map.get(place * 5);
                }

                //This verifies the 3 times rule (no character can repeat more than 3 times)
                for (int j = 0; j < currNum % 5; j++) {
                    roman += map.get(place);
                }
            }
            num -= currNum * place;
        }
        return roman;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String roman = intToRoman(num);
        System.out.println(num + " in roman: " + roman);
        s.close();
    }
}
