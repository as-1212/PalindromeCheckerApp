import java.util.Stack;

//Use Case 5 : Stack-Based Palindrome Checker
public class UseCase5PalindromeCheckerApp {
    public static void main (String [] args) {
        String input = "noon";
        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text : " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}



