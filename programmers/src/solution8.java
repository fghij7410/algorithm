public class solution8 {

    public static double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; arr.length>i;i++){
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}
