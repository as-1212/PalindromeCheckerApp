import java.util.*;

//Use Case 8 : Linked List Based Palindrome Checker
public class UseCase8PalindromeCheckerApp {
    public static void main (String [] args) {
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        boolean isPalindrome = true;
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
