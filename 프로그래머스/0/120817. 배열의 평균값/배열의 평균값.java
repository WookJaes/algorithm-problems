class Solution {
    public double solution(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double avg = (double) sum / numbers.length;

        System.out.printf("numbers의 원소들의 평균 값은 %.1f입니다.%n", avg);

        return avg;
    }
}