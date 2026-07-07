import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int size = prices.length;
        int[] answer = new int[size];
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = size - idx - 1;
        }
        
        return answer;
    }
}