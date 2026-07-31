import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String solution(String number, int k) {
        
    Deque<Character> stack = new ArrayDeque<>();
        
        int keep = number.length() - k;
        
        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() < digit) {
                stack.pollLast();
                k--;
            }
            
            stack.offerLast(digit);
        }
        
        StringBuilder sb = new StringBuilder(keep);
        
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.substring(0, keep);
    }
}