import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        char[] digits = numbers.toCharArray();
        Arrays.sort(digits);

        dfs(digits, 0);

        int count = 0;
        for (int number : set) {
            if (isPrime(number)) {
                count++;
            }
        }
        
        return count;
    }
    
    private void dfs(char[] digits, int number) {
        for (int i = 0; i < digits.length; i++) {
            if (visited[i]) continue;

            if (i > 0 && digits[i] == digits[i - 1] && !visited[i - 1]) {
                continue;
            }
            
            visited[i] = true;

            int nextNumber = number * 10 + (digits[i] - '0');
            set.add(nextNumber);
            dfs(digits, nextNumber);

            visited[i] = false;
        }
    }
        
    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
            
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
            
        return true;
    }
}