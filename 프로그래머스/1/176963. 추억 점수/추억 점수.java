import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> point = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            point.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                answer[i] += point.getOrDefault(person, 0);
            }
        }
        
        return answer;
    }
}