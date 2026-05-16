class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String s : babbling) {
            int idx = 0;
            String prev = "";
            
            while (idx < s.length()) {
                boolean matched = false;
                
                for (String w : words) {
                    if (w.equals(prev)) continue;
                    
                    if (s.startsWith(w, idx)) {
                        idx += w.length();
                        prev = w;
                        matched = true;
                        break;
                    }
                }
                
                if (!matched) break;
            }
            
            if (idx == s.length()) answer++;
        }
        
        return answer;
    }
}