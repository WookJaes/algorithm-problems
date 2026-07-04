class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return dfs(k, dungeons, visited);
    }
    
    private int dfs(int k, int[][] dungeons, boolean[] visited) {
        int max = 0;
        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) continue;
            
            int need = dungeons[i][0];
            int cost = dungeons[i][1];
            
            if (k < need) continue;
            
            visited[i] = true;
            max = Math.max(max, 1 + dfs(k - cost, dungeons, visited));
            visited[i] = false;
        }
        
        return max;
    }
}