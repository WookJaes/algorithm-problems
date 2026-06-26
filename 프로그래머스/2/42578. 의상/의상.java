import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for (String[] cloth : clothes) {
            String type = cloth[1];
            
            // 해당 종류의 의상 수 + 1
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        for (int count : map.values()) {
            // 각 종류마다 입지 않는 경우도 포함해서 곱함
            answer *= count + 1;
        }
        
        // 아무것도 입지 않는 경우 제외
        return answer - 1;
    }
}