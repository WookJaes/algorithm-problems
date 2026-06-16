class Solution {
    public int solution(int n) {
        // 2진수로 반환한 후 1의 개수를 알려줌
        int nCount = Integer.bitCount(n);
        int count = 0;
        
        while (nCount != count) {
            n += 1;
            count = Integer.bitCount(n);
        }
        
        return n;
    }
}