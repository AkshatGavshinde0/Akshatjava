import java.util.ArrayDeque;

public class PalindromeCheck {
    public static void main(String[] args) {
        String word = "madam";

        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

