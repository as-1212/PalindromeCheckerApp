import java.util.*;
//Use Case 9 : Recursive Palindrome Checker
public class UseCase9PalindromeCheckerApp {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        String input = "madam";
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        boolean result = isPalindrome(processedInput, 0, processedInput.length() - 1);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}