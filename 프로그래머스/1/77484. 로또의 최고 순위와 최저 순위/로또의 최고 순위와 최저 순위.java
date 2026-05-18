class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        boolean[] winning = new boolean[46];
        int matchCount = 0;
        int zeroCount = 0;
        
        for (int win : win_nums) {
            winning[win] = true;
        }
        
        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winning[num]) {
                matchCount++;
            }
        }
        
        int max = getRank(matchCount + zeroCount);
        int min = getRank(matchCount);
        
        return new int[] {max, min};
    }
    
    private int getRank(int count) {
        if (count < 1) {
            return 6;
        } else {
            return 7 - count;
        }
    }
}