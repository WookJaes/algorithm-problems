import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for (int start = 0; start <= discount.length - 10; start++) {
            Map<String, Integer> map = new HashMap<>();
            
            // 10일 기간의 할인 상품 저장
            for (int day = start; day < start + 10; day++) {
                map.put(discount[day], map.getOrDefault(discount[day], 0) + 1);
            }
            
            boolean flag = true;
            
            // 상품 비교
            for (int i = 0; i < want.length; i++) {
                if (map.getOrDefault(want[i], 0) != number[i]) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                answer++;
            }
        }
        
        return answer;
    }
}