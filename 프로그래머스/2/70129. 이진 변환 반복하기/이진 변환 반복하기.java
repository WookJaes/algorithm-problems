class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            int length = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    length++;
                } else {
                    zeroCount++;
                }
            }
            
            // 남은 문자열 길이를 2진수 문자열로 변환
            s = Integer.toBinaryString(length);
            count++;
        }
        
        return new int[] {count, zeroCount};
    }
}