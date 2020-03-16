import java.util.Scanner;

public class removeWhiteSpaces {

    //This is not the optimized code; since strings are immutable, a new object is created at every iteration which is slow
    private static String removeSpaces(String str) {
        String ans = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            ans += str.charAt(i);
        }
        return ans;
    }

    //This is optimized code as there is no creation of new string object (String builder is even faster[its not synchronized though)
    private static String removeSpacesOptimzed(String str) {
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            sbuffer.append(str.charAt(i));
        }
        return String.valueOf(sbuffer);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String ans = removeSpaces(str);
        long startTime = System.currentTimeMillis();
        long startTime1 = System.currentTimeMillis();
        String ans1 = removeSpacesOptimzed(str);
        System.out.println("The string without without white spaces: " + ans + " time taken: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("The string without without white spaces: " + ans1 + " time taken: " + (System.currentTimeMillis() - startTime1) + "ms");
    }
}
