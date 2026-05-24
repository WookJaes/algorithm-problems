class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] skipArr = new boolean[26];
        
        for (char c : skip.toCharArray()) {
            skipArr[c - 'a'] = true;
        }
        
        char[] result = s.toCharArray();
        
        for (int i = 0; i < result.length; i++) {
            int current = result[i] - 'a';
            int move = index;
            
            while (move > 0) {
                if (++current == 26) current = 0;
                if (!skipArr[current]) move--;
            }
            
            result[i] = (char) (current + 'a');
        }
        
        return new String(result);
    }
}