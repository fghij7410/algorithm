public class solution11 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i = 0;answer.length>i;i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
