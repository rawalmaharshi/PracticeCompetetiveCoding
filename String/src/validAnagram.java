public class validAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;

            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String one = "anagram";
        String two = "nagaram";
        System.out.println("The entered are valid anagrams: " + isAnagram(one, two));
    }
}
