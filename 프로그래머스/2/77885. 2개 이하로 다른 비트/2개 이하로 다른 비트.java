class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];
            
            // 짝수는 마지막 비트가 0
            if ((x & 1) == 0) {
                answer[i] = x + 1;
            } else {
                // 오른쪽에서부터 처음 나오는 0 찾기
                long bit = 1;
                
                while ((x & bit) != 0) {
                    bit = bit << 1;
                }
                
                answer[i] = x + bit - (bit >> 1);
            }
        }
        
        return answer;
    }
}