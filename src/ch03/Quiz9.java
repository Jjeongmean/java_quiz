package ch03;

import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력: ");
        int num = scanner.nextInt();

        //조건 3개 이상 ➡ 삼항연산자 중첩
        System.out.println(num > 0 ? "양수": (num < 0 ? "음수": "0"));

        //int num = 0; 이건 조건이 0일 경우만 해당되기에 scanner 사용해야함
        //System.out.println(num > 0 ? "양수" :(num < 0 ? "음수" : 0));
        // 조건식 ? 값or연산식 : 값or연산식
        
    }
}
