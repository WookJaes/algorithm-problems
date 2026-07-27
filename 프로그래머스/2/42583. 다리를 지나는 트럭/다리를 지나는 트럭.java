import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < bridge_length; i++) {
            q.offer(0);
        }
        
        int time = 0;
        int currentWeight = 0;
        int idx = 0;
        
        while (idx < truck_weights.length) {
            time++;
            currentWeight -= q.poll();
            
            if (currentWeight + truck_weights[idx] <= weight) {
                q.offer(truck_weights[idx]);
                currentWeight += truck_weights[idx];
                idx++;
            } else {
                q.offer(0);
            }
        }
        
        return time + bridge_length;
    }
}