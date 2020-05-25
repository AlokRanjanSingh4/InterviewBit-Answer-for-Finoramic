public class Solution {
    public int braces(String A) {
        Stack<Character>stack = new Stack<>();
        for(char ch : A.toCharArray()) {
            stack.push(ch);
            if(ch == ')') {
                int count = 0;
                while(stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                stack.pop();
                count++;
                if(count < 4)
                    return 1;
            }
        }
        return 0;
    }
}