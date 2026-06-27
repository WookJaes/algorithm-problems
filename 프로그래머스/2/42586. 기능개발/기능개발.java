import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            // 기능 배포가 가능한 상태까지의 일수
            int days = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            deque.addLast(days);
        }
        
        while (!deque.isEmpty()) {
            // 앞 기능의 배포일이 현재 배포 묶음의 기준이 됨
            int deployDay = deque.removeFirst();
            int count = 1;
            
            while (!deque.isEmpty() && deque.peekFirst() <= deployDay) {
                deque.removeFirst();
                count++;
            }
            
            answer.add(count);
        }
        
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}