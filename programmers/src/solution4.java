public class solution4 {

    public static long solution(int a, int b) {
        long answer = 0;

        if(a>b){
            for(;a>=b;b++){
                answer+=b;
            }
        }else if(b>a){
            for(;b>=a;a++){
                answer+=a;
            }
        }else{
            answer=a;
        }

        return answer;
    }
}
