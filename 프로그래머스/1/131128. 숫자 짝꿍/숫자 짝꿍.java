class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            countX[X.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            countY[Y.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int num = 9; num >= 0; num--) {
            int pairCount = Math.min(countX[num], countY[num]);
            
            for (int i = 0; i < pairCount; i++) {
                sb.append(num);
            }
        }
        
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}