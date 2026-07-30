class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String curr : skill_trees) {
            answer += isValid(skill, curr) ? 1 : 0;
        }
        
        return answer;
    }
    
    private boolean isValid(String skill, String curr) {
        int idx = 0;
        
        for (char c: curr.toCharArray()) {
            int pos = skill.indexOf(c);
            
            if (pos == -1) continue;
            if (pos != idx) return false;
            
            idx++;
        }
        
        return true;
    }
}