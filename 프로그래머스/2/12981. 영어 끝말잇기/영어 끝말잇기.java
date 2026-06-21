import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        List<String > list = new ArrayList<>();
        list.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) || isInvalid(list.get(list.size() - 1), words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            list.add(words[i]);
        }

        return answer;
    }
    
    private boolean isInvalid(String prev, String curr) {
        return prev.charAt(prev.length() - 1) != curr.charAt(0);
    }
}