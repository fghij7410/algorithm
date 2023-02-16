public class solution6 {

    public static int solution(int[] numbers) {
        int answer = 45;

        for(int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}
