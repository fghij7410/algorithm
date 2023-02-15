import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num [] = new int [9];
        for(int i =0;num.length>i;i++){
            num[i] = sc.nextInt();
        }
        int answer = solution(num);
        System.out.println(answer);
    }

    public static int solution(int[] numbers) {
        int answer = 45;

        for(int number : numbers) {
            answer -= number;
        }

        return answer;
    }

}


