import java.util.ArrayList;

class Solution {
    public int solution(int n, int[][] wires) {
        
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        
        // 인접 리스트 생성
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 양방향 그래프 생성
        for (int[] wire : wires) {
            int from = wire[0];
            int to = wire[1];
            
            graph[from].add(to);
            graph[to].add(from);
        }
        
        int answer = Integer.MAX_VALUE;
        
        // 간선 하나씩 끊기
        for (int[] wire : wires) {
            
            boolean[] visited = new boolean[n + 1];
            
            int count = dfs(1, visited, wire[0], wire[1], graph);
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int dfs(int node, boolean[] visited, int cutA, int cutB, ArrayList<Integer>[] graph) {
        
        visited[node] = true;
        int count = 1;
        
        for (int next : graph[node]) {
            // 현재 끊은 간선은 탐색 X
            if ((node == cutA && next == cutB) ||
                (node == cutB && next == cutA)) {
                continue;
            }
            
            if (!visited[next]) {
                count += dfs(next, visited, cutA, cutB, graph);
            }
        }
        
        return count;
    }
}