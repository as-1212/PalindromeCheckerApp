import java.util.*;
class RecursivePalindrome {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}

// Stack-based Palindrome
class StackPalindrome {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}

// Deque-based Palindrome
class DequePalindrome {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Performance Comparison ===");

        String input = "Able was I ere I saw Elba";
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Recursive Approach
        long startTime = System.nanoTime();
        boolean resultRecursive = RecursivePalindrome.isPalindrome(processedInput, 0, processedInput.length() - 1);
        long endTime = System.nanoTime();
        long timeRecursive = endTime - startTime;

        // Stack Approach
        startTime = System.nanoTime();
        boolean resultStack = StackPalindrome.isPalindrome(processedInput);
        endTime = System.nanoTime();
        long timeStack = endTime - startTime;

        // Deque Approach
        startTime = System.nanoTime();
        boolean resultDeque = DequePalindrome.isPalindrome(processedInput);
        endTime = System.nanoTime();
        long timeDeque = endTime - startTime;

        // Display Results
        System.out.println("Input: " + input);
        System.out.println();

        System.out.println("Recursive Approach: Result=" + resultRecursive + ", Time=" + timeRecursive + " ns");
        System.out.println("Stack Approach:     Result=" + resultStack + ", Time=" + timeStack + " ns");
        System.out.println("Deque Approach:     Result=" + resultDeque + ", Time=" + timeDeque + " ns");
    }
}