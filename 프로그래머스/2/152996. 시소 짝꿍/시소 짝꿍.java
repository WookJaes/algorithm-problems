import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(int[] weights) {
        
        // 몸무게, 인원 수
        Map<Integer, Long> map = new HashMap<>();
        long answer = 0;
        
        for (int w : weights) {
            map.put(w, map.getOrDefault(w, 0L) + 1);
        }
        
        for (int w : map.keySet()) {
            long count = map.get(w);
            
            // 동일 몸무게
            answer += count * (count - 1) / 2;
            
            // 2m, 3m
            if (w % 2 == 0) {
                answer += count * map.getOrDefault(w / 2 * 3, 0L);
            }
            
            // 2m, 4m
            answer += count * map.getOrDefault(w * 2, 0L);
            
            // 3m, 4m
            if (w % 3 == 0) {
                answer += count * map.getOrDefault(w / 3 * 4, 0L);
            }
        }
        
        return answer;
    }
}