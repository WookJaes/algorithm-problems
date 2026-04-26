class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                idx = 0;
                sb.append(ch);
            } else {
                sb.append(idx % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
                idx++;
            }
        }
        
        return sb.toString();
    }
}