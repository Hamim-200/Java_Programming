package Book;

public class BracketBalancedChecker {
    public boolean isBalanced(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            // If count goes negative at any point, it means there's a closing bracket without a corresponding opening bracket
            if (count < 0) {
                return false;
            }
        }
        // If count is not zero at the end, it means there are unmatched opening brackets
        return count == 0;
    }
}