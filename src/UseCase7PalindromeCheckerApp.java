import java.util.*;

//Use Case 7 : Deque-Based Optimized Palindrome Checker
public class UseCase7PalindromeCheckerApp {
    public static void main (String [] args) {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.add(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text : " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
