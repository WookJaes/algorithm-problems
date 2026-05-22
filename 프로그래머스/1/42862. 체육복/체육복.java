import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1);
        
        for (int l : lost) arr[l]--;
        for (int r : reserve) arr[r]++;
        
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                if (i > 1 && arr[i - 1] == 2) {
                    arr[i - 1]--;
                    arr[i]++;
                } else if (i < n && arr[i + 1] == 2) {
                    arr[i + 1]--;
                    arr[i]++;
                }
            }
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > 0) count++;
        }
        
        return count;
    }
}