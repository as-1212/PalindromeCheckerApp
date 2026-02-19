//Use Case 3 : Reverse String Based Palindrome Check
public class UseCase3PalindromeCheckerApp {
    public static void main (String[] args) {
        String input = "madam";
        boolean isPalindrome = true;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text : " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
