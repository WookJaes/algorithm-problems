class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int num = arr1[i] | arr2[i];
            
            String result = "";
            
            for (int j = 0; j < n; j++) {
                if ((num & (1 << (n - 1 - j))) == 0) {
                    result += ' ';
                } else {
                    result += '#';
                }
            }
            
            answer[i] = result;
        }
        
        return answer;
    }
}