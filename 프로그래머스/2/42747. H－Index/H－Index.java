import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        
        for (int i = 0; i < citations.length; i++) {
            // 남은 논문의 수
            int h = citations.length - i;
            
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}