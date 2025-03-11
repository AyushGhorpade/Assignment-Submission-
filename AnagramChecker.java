import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String s1, String s2) {
        
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        jav
        if (s1.length() != s2.length()) {
            return false;
        }

        
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();
        Arrays.sort(ca1);
        Arrays.sort(ca1);

        
        return Arrays.equals(ca1, ca1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();
        scanner.close();

        boolean result = areAnagrams(s1, s2);
        System.out.println("Are the Given Strings Anagram : - " + result);
    }
}
