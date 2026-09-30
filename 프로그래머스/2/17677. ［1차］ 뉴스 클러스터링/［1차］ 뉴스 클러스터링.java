import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        Map<String, Integer> map1 = makeMap(str1);
        Map<String, Integer> map2 = makeMap(str2);
        
        int intersection = 0;
        int union = 0;
        
        // 두 문자열에서 등장하는 다중집합 원소 확인
        Set<String> keys = new HashSet<>(map1.keySet());
        keys.addAll(map2.keySet());
        
        for (String key : keys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);
            
            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }
        
        if (union == 0) {
            return 65536;
        }
        
        return (int) ((double) intersection / union * 65536);
    }
    
    // 영문 소문자로 이루어진 2글자 다중집합 생성
    private Map<String, Integer> makeMap(String str) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            
            if (c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') {
                String pair = "" + c1 + c2;
                map.put(pair, map.getOrDefault(pair, 0) + 1);
            }
        }
        
        return map;
    }
}