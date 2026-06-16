import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 크기별 귤 개수 저장 공간
        Map<Integer, Integer> map = new HashMap<>();
        
        // 귤 개수 저장
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        // 개수만 따로 분리
        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Collections.reverseOrder());
        
        int answer = 0;
        int selected = 0;
        
        for (int count : counts) {
            selected += count;
            answer++;
            
            if (selected >= k) {
                break;
            }
        }
        
        return answer;
    }
}