class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        // 노란색 격자는 1개 이상이며, 갈색 격자 1줄에 감싸져 있음 
        for (int i = 3; i < sum / 2; i++) {
            int row = i;
            int col = sum / row;
            
            // 노란색 격자는 갈색 격자 1줄에 감싸져 있음
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
        
        return answer;
    }
}