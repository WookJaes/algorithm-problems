class Solution {
    public int[] solution(int[][] arr) {
        
        int[] answer = new int[2];
        
        compress(arr, 0, 0, arr.length, answer);

        return answer;
    }
    
    // (x, y) 기준으로 압축
    private void compress(int[][] arr, int x, int y, int size, int[] answer) {
        if (isSame(arr, x, y, size)) {
            
            // 모두 같으면 해당 숫자의 개수 증가
            answer[arr[x][y]]++;
            return;
        }
        
        int half = size / 2;
        
        compress(arr, x, y, half, answer);
        compress(arr, x, y + half, half, answer);
        compress(arr, x + half, y, half, answer);
        compress(arr, x + half, y + half, half, answer);
    }
    
    private boolean isSame(int[][] arr, int x, int y, int size) {
        // 기준
        int value = arr[x][y];
        
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        
        return true;
    }
}