class Solution {
    
    int answer = 0;
    int count = 0;
    String[] chars = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        
        dfs("", word);
        return answer;
    }
    
    private void dfs(String current, String target) {
        if (answer != 0) {
            return;
        }
        
        if (!current.isEmpty()) {
            count++;
            
            if (current.equals(target)) {
                answer = count;
                return;
            }
        }
        
        if (current.length() == 5) {
            return;
        }
        
        for (int i = 0; i < 5; i++) {
            dfs(current + chars[i], target);
        }
    }
}