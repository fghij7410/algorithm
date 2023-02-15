public class Even_and_Odd {

    public static String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer="Even";
        }else {
            answer="Odd";
        }
        return answer;
    }
}
