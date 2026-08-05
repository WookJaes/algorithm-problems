class Solution {
    public int solution(String dirs) {
        
        boolean[][][][] visited = new boolean[11][11][11][11];
        
        int x = 5;
        int y = 5;
        int answer = 0;
        
        for (char c : dirs.toCharArray()) {
            
            int nx = x;
            int ny = y;
            
            switch (c) {
                case 'U' : ny++; break;
                case 'D' : ny--; break;
                case 'L' : nx--; break;
                case 'R' : nx++; break;
            }
            
            if (nx < 0 || nx > 10 || ny < 0 || ny > 10)
                continue;
            
            if (!visited[x][y][nx][ny]) {
                visited[x][y][nx][ny] = true;
                visited[nx][ny][x][y] = true;
                answer++;
            }
            
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}