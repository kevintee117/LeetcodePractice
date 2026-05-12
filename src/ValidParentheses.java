import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        //initialize empty stack
        Deque<Character> characterDeque = new ArrayDeque<>();
        //traverse input string character by character
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            //if current character is an opening bracket, push it onto stack
            if (currentChar == '(' ||
                    currentChar == '{' ||
                    currentChar == '[') {
                characterDeque.push(currentChar);
            }
            /*
            If the current character is a closing bracket (i.e., ')', '}', ']'), check if the stack is empty.
            If it is empty, return false, because the closing bracket does not have a corresponding opening bracket.
            Otherwise, pop the top element from the stack and check if it matches the current closing bracket.
            If it does not match, return false, because the brackets are not valid.
             */
            if (currentChar == ')' ||
                    currentChar == '}' ||
                    currentChar == ']') {
                if(characterDeque.isEmpty()) {
                    return false;
                }
                char top = characterDeque.peek();
                if ((top == '(' && currentChar == ')') ||
                        (top == '{' && currentChar == '}') ||
                        (top == '[' && currentChar == ']')) {
                    characterDeque.pop();
                } else {
                    return false;
                }
            }
        }
        /*
        After traversing the entire input string, if the stack is empty, return true, because all opening brackets
        have been matched with their corresponding closing brackets. Otherwise, return false, because some opening
        brackets have not been matched with their corresponding closing brackets.
         */
        return characterDeque.isEmpty();
    }
}
