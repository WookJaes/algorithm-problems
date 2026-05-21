class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int end = 0;
        
        for (int s : section) {
            if (s > end) {
                count ++;
                end = s + m - 1;
            }
        }
        
        return count;
    }
}