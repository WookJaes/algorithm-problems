class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder target = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int num = 0;
        
        while (target.length() < m * t) {
            target.append(Integer.toString(num++, n));
        }
        
        for (int i = 0; i < t; i++) {
            result.append(target.charAt(p - 1 + i * m));
        }
        
        return result.toString().toUpperCase();
    }
}