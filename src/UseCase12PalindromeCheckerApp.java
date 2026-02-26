import java.util.*;
//Use Case 12 : Strategy Pattern for Palindrome Algorithms
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : processedInput.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : processedInput.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    public PalindromeCheckerContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        PalindromeCheckerContext context = new PalindromeCheckerContext(new StackStrategy());
        boolean resultStack = context.checkPalindrome(input);
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + resultStack);
    }
}
