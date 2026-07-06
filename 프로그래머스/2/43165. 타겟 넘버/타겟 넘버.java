class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, target, 0);
    }
    
    private int dfs(int[] numbers, int depth, int target, int sum) {

        // 모든 숫자 사용
        if (depth == numbers.length) {
            return sum == target ? 1 : 0;
        }
        
        return dfs(numbers, depth + 1, target, sum + numbers[depth]) + dfs(numbers, depth + 1, target, sum - numbers[depth]);
    }
}