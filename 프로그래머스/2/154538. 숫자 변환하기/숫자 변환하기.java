import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) {
            return 0;
        }
        
        int[] dp = new int[y + 1];
        Arrays.fill(dp, -1);
        
        // BFS 사용
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(x);
        dp[x] = 0;
        
        while (!q.isEmpty()) {
            int now = q.poll();
            
            int[] nexts = {now + n, now * 2, now * 3};
            
            for (int next : nexts) {
                // 범위를 벗어나거나 이미 방문한 경우
                if (next > y || dp[next] != -1) {
                    continue;
                }
                
                // 연산 횟수 계산
                dp[next] = dp[now] + 1;
                
                if (next == y) {
                    return dp[next];
                }
                
                q.offer(next);
            }
        }
        
        return -1;
    }
}