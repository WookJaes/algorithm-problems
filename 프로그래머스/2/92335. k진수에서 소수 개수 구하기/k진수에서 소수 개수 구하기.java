class Solution {
    public int solution(int n, int k) {
        String result = Integer.toString(n, k);
        String[] numbers = result.split("0");
        int answer = 0;
        
        for (String number : numbers) {
            if (number.isEmpty()) {
                continue;
            }
            
            long num = Long.parseLong(number);
            
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;
        
        for (long i = 5; i <= n / i; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}