class Solution {
    public int solution(int n) {
        int mod = 1234567;
        int prev = 0;
        int curr = 1;
        
        for (int i = 2; i <= n; i++) {
            int next = (prev + curr) % mod;
            prev = curr;
            curr = next;
        }
        
        return curr;
    }
}