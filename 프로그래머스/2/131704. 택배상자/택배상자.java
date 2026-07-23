import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 1; i <= order.length; i++) {
            stack.push(i);
            
            while (!stack.isEmpty() && stack.peek() == order[answer]) {
                stack.pop();
                answer++;
            }
        }
        
        return answer;
    }
}