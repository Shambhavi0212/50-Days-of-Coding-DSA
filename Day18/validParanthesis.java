/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Constraints:
1 <= s.length <= 10^4
s consists of parentheses only.
*/
class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean foundPair = true;
        while (foundPair) {
            foundPair = false;
            for (int i=0;i<sb.length()-1;i++) {
                char a=sb.charAt(i);
                char b=sb.charAt(i + 1);
                if ((a=='('&&b==')') ||(a == '[' && b == ']')||(a=='{' && b =='}'))
                 {
                    sb.delete(i,i+2); // remove the pair
                    foundPair = true;
                    break; // restart scanning from beginning
                }
            }
        }
        return sb.length()==0;
    }
}
