class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        
        // 두 수의 최소공배수 = 두 수의 곱 / 두 수의 최대공약수
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm * arr[i] / gcd(lcm, arr[i]);
        }
        
        return lcm;
    }
    
    private int gcd(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
}