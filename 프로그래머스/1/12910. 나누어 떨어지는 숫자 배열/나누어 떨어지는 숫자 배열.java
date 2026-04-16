import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> array = new ArrayList<>();
        
        for (int n : arr) {
            if(n % divisor == 0)
            array.add(n);
        }
        
        if (array.isEmpty()) {
            array.add(-1);
        }
        
        Collections.sort(array);
        
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}