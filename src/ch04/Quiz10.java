package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 0; //통장 잔고
        boolean run = true; //실행 상태

        while (run) {
            System.out.println("--------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------");
            System.out.println("선택> ");

            //사용자로부터 입력을 받는다
            int menuNum = scanner.nextInt();


            switch (menuNum) {
                case 1:
                    System.out.println("예금액> ");
                    int money = scanner.nextInt();
                    balance += money; //통장 잔고에 기존에 예금했던 돈을 유지하기 위해 누적 합산
                    break;
                case 2:
                    System.out.println("출금액> ");
                    balance -= scanner.nextInt(); // 누적 차감
                    break;
                case 3:
                    System.out.println("잔고> ");
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

//        boolean run = true;
//        int balance = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        while(run){
//            System.out.println("-------------");
//            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//            System.out.println("-------------");
//            System.out.println("선택> ");
//
//           int number = scanner.nextInt();
//           int money = 0;
//
//           switch (number) {
//               case 1:
//                   System.out.println("예금액> ");
//                   money = scanner.nextInt();
//                   balance += money;
//                   break;
//               case 2:
//                   System.out.println("출금액>");
//                   money = scanner.nextInt();
//                   balance -= money;
//                   break;
//               case 3:
//                   System.out.println("잔고> " + balance);
//                   break;
//               case 4:
//                   run = false;
//                   break;
//           }
//        }
//        System.out.println("프로그램 종료");
//        scanner.close();
//    }
}
