class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int digit = storey % 10;
            storey /= 10;
            
            // 현재 자릿수가 5보다 크면 올림 처리
            if (digit > 5) {
                answer += 10 - digit;
                storey++;
            } else if (digit < 5) {
                answer += digit;
                
            // 현재 자릿수가 5인 경우 다음 자릿수를 보고 올림/내림 판단
            } else {
                int nextDigit = storey % 10;
                
                if (nextDigit >= 5) {
                    answer += 5;
                    storey++;
                } else {
                    answer += 5;
                }
            }
        }
        
        return answer;
    }
}