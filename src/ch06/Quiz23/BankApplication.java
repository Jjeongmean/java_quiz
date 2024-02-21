package ch06.Quiz23;

import java.util.Scanner;

public class BankApplication {
    // private: BankApplication 클래스 안에서만 사용 가능
    // static: static main 메소드 안에서 사용 가능
    // static으로 선언한 이유: main이 static이니 main에서 바로 사용할 수 있도록
    private static Scanner scanner = new Scanner(System.in);
    private static Account[] accountArray = new Account[100]; //accountArray는 account 객체만 저장가능(100개 까지)

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
            System.out.println("------------------------------------------------");

            System.out.println("선택> ");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1: createAccount(); break;
                case 2: accountList(); break;
                case 3: deposit(); break;
                case 4: withdraw(); break;
                case 5: run = false; break;
            }
        } // switch

        System.out.println("프로그램 종료");
    } // main

    //static: static이 붙은 main메소드 안에서 호출하기 위해 붙여줌
    // 1. 계좌 생성
    private static void createAccount () {
        System.out.println("-------------");
        System.out.println("계좌생성");
        System.out.println("-------------");

        System.out.println("계좌번호: ");
        String ano = scanner.next();

        System.out.println("계좌 주: ");
        String owner = scanner.next();

        System.out.println("초기입금액: ");
        int balance = scanner.nextInt();
        // 생성자에 입력받은 ano, owner, balance가 들어간다 ➡ newAccount
        
        // 입력받은 정보를 이용해 Account 객체 생성
        Account newAccount = new Account(ano, owner, balance);
        // accountArray라는 빈 배열에 index마다 newAccount가 통째로 담긴다

        //accountArray 배열에 Account 객체를 저장하기
        for (int i = 0; i < accountArray.length; i++) {
            //accountArray의 디폴트 값은 null이 들어있다
            //⭐계좌 객체를 순서대로 자장하기 위해 null체크
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                //⭐쓸데없는 반복은 피한다, newAccount 객체를 배열에 전부 저장하지 않는다.
                break;
            }

        }
    }

    // 2. 계좌 목록 보기
    private static void accountList() {
        System.out.println("-------------");
        System.out.println("계좌목록");
        System.out.println("-------------");

        // 변수 account = accountArray에 있던 계좌 (대입)
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i]; // 참조타입을 클래스명으로 입력

            //⭐accountArray 배열 안에서 Account 객체가 있는 부분만 가져온다.
            if (account != null) { // account가 null이 아닐때 [즉 계좌가 있을때](! not 부정)
                // 계좌정보를 print도 가능하지만 println으로 한꺼번에 입력 가능
                System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance());
            } else {
                break; //⭐쓸데없는 반복은 피하기
            }
        }

    }

    // 3. 예금
    private static void deposit() {
        System.out.println("-------------");
        System.out.println("예금");
        System.out.println("-------------");

        System.out.println("계좌번호: ");
        String ano = scanner.next();

        System.out.println("예금액: ");
        int money = scanner.nextInt();

        // 입력받은 계좌번호로 고객계좌 객체 찾기
        // 계좌번호 매개로 받은 findAccount를 account 변수에 대입
        Account account = findAccount(ano); // 찾은 고객계좌

        //해당 고객계좌가 없는 메소드를 종료시킴
        //아래에서 찾은 값(동일한 계좌번호)가 없을때, 계좌없습니다 뜨고,
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다");
            return;
        }
        // 동일한 계좌번호가 있을 때에는 계좌금액인 Balance에 입금액을 더해 setBalance에 매개하여 저장
        //'기존에 저장되어 있던 예금액 + 새로 입금할 예금액' 을 더해서 예금해준다.
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 완료되었습니다.");
    }

    // 4. 출금
    private  static void withdraw() {
        System.out.println("-------------");
        System.out.println("출금");
        System.out.println("-------------");

        System.out.println("계좌번호; ");
        String ano = scanner.next();

        System.out.println("출금액: ");
        int money = scanner.nextInt();

        // 입력받은 계좌번호로 고객계좌 객체 찾기
        // 계좌번호 매개로 받은 findAccount를 account 변수에 대입
        Account account = findAccount(ano); // 찾은 고객계좌

        //해당 고객계좌가 없는 메소드를 종료시킴
        //아래에서 찾은 값(동일한 계좌번호)가 없을때, 계좌없습니다 뜨고,
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다");
            return;
        }
        //'기존에 저장되어 있던 출금액 - 출금할 예금액' 을 빼서 잔고에 추가해준다.
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 완료되었습니다.");
    }

    // 5. 계좌번호로 본인 계좌 찾기(Account 객체를 리턴해준다)

    // ano라는 계좌번호를 매개로 받는 findAccount
    private static Account findAccount(String ano) {
        Account account = null; // return하기 위해 for문 바깥에 변수 선언

        // 배열에 저장된 객체별 계좌번호를 하나씩 고객계좌를 비교해간다
        for (int i = 0; i < accountArray.length; i++) {

            //⭐accountArray 배열 안에서 Account 객체가 있는 부분만 가져온다.
            if (accountArray[i] != null) {
                //객체에 저장된 계좌번호 가져오기
                //배열에 있는 ano값을 dbAno에 대입해준다
                String dbAno = accountArray[i].getAno();

                // 객체에 저장된 계좌번호와 매개변수의 계좌번호가 같으면 해당 객체를 account에 저장
                //dbAno에 있는 ano가 매개로 받는 ano와 동일할때
                if (dbAno.equals(ano)) {
                    //account라는 변수에 해당 인덱스를 대입한다
                    account = accountArray[i];
                    break; // 계좌번호를 찾으면 반복문을 빠져나온다

                }
            }
        }
        return account; // 찾은 계좌 객체를 리턴
    }
}
