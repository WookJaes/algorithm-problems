class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                left.append(i);
            }
        }
        
        String right = new StringBuilder(left).reverse().toString();
        return left + "0" + right;
    }
}