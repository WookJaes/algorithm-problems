class Solution {
    public int solution(String[][] board, int h, int w) {
        int rows = board.length;
        int cols = board[0].length;
        int answer = 0;
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        String target = board[h][w];
        
        for (int i = 0; i < 4; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];
            
            if ((nh >= 0 && nh < rows) && (nw >= 0 && nw < cols)) {
                if (target.equals(board[nh][nw])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}