import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N + 2];
        
        // 스테이지 별 멈춘 사용자 수 측정
        for (int stage : stages) {
            count[stage]++;
        }
        
        double[] rate = new double[N + 1];
        int total = stages.length;
        
        // 스테이지별 실패율
        for (int i = 1; i <= N; i++) {
            if (total == 0) {
                rate[i] = 0;
            } else {
                rate[i] = (double) count[i] / total;
            }
            total -= count[i];
        }
        
        // 스테이지 번호를 실패율 순으로 정렬
        Integer[] answer = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            answer[i] = i + 1;
        }
        
        // 실패율 내림차순, 같으면 스테이지 번호 기준 오름차순
        Arrays.sort(answer, (a, b) -> {
            if (rate[a] == rate[b]) {
                return a - b;
            }
            return Double.compare(rate[b], rate[a]);
        });
        
        int[] result = new int[N];
        
        for (int i = 0; i < N; i++) {
            result[i] = answer[i];
        }
        
        return result;
    }
}