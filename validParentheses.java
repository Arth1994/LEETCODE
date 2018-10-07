class Solution {
    public boolean isValid(String s) {
        int count = 0;
        char prev= '\0';
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        if (s.length() == 1)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '{' && stack.pop() == '}')) {
                count++;
            } else if ((s.charAt(i) == '[' && stack.pop() == ']')) {
                count++;
            } else if ((s.charAt(i) == '(' && stack.pop() == ')')) {
                count++;
            } else if ((s.charAt(i) == '(' && s.charAt(i + 1) == ')') || (s.charAt(i) == '{' && s.charAt(i + 1) == '}')
                    || (s.charAt(i) == '[' && s.charAt(i + 1) == ']')) {
                count++;
            } else if (s.charAt(i) == prev) {
                count++;
            }
            prev = s.charAt(i);
        }
        return (count == s.length() / 2);
    }
}