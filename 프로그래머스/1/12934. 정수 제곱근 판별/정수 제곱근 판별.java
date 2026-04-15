class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        
        if(x * x == n) {
            return (long) Math.pow(x + 1, 2);
        } else {
            return -1;
        }
    }
}