import java.util.*;

class Solution {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 1});
        maps[0][0] = 0;
        
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int cnt = curr[2];
            
            if (x == n - 1 && y == m - 1) {
                return cnt;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                } 
                
                if (maps[nx][ny] == 0) {
                    continue;
                }
                
                maps[nx][ny] = 0;
                queue.add(new int[]{nx, ny, cnt + 1});
            }
        }
        
        return -1;
    }
}