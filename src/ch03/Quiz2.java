package ch03;

public class Quiz2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90))? "가" : "나";
        System.out.println(result); // !의 부정으로 "나" 출력

        /*
        출력: 가
        풀이: NOT(부정) 논리연산자 ! 로 인해 “나” 가 출력된다
         */
    }
}
