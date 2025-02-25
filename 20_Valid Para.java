import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
             
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false; 
                }
            }
        }
        return stack.isEmpty(); 
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();
        
        // Test cases
        System.out.println(validator.isValid("()"));       // Output: true
        System.out.println(validator.isValid("()[]{}"));   // Output: true
        System.out.println(validator.isValid("(]"));       // Output: false
        System.out.println(validator.isValid("([])"));     // Output: true
    }
}
