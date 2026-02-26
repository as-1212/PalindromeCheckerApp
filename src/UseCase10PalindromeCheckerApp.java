import java.util.*;
//Use Case 10 : Normalized Palindrome Validation
public class UseCase10PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        boolean result = isPalindrome(processedInput);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}