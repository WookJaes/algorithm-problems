class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] minPress = new int[26];
        
        // 각 문자의 최소 누름 횟수를 큰 값으로 초기화
        for (int i = 0; i < 26; i++) {
            minPress[i] = Integer.MAX_VALUE;
        }
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                int idx = key.charAt(i) - 'A';
                minPress[idx] = Math.min(minPress[idx], i + 1);
            }
        }
        
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                int idx = targets[i].charAt(j) - 'A';
                
                if (minPress[idx] == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                
                sum += minPress[idx];
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}