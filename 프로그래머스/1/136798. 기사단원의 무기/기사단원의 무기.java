class Solution {
    public int solution(int number, int limit, int power) {
        
        int[] divisors = new int[number + 1];
        
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisors[j]++;
            }
        }
        
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            if (divisors[i] > limit) {
                answer += power;
            } else {
                answer += divisors[i];
            }
        }
        
        return answer;
    }
}