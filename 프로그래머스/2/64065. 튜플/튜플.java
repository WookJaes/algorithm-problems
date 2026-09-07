import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replace("{{", "").replace("}}", "");
        String[] arr = s.split("\\},\\{");
        
        // 크기가 작은 순서로 정렬
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[arr.length];
        int idx = 0;
        
        for (String group : arr) {
            for (String numStr : group.split(",")) {
                int num = Integer.parseInt(numStr);
                
                // 처음 등장한 숫자 저장
                if (set.add(num)) {
                    answer[idx++] = num;
                }
            }
        }
        
        return answer;
    }
}