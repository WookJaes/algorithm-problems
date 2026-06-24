class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        
        for (int i = 0; i < answer.length; i++) {
            long idx = left + i;
            long row = idx / n;
            long col = idx % n;
            
            answer[i] = (int)(Math.max(row, col) + 1);
        }
        
        return answer;
    }
}