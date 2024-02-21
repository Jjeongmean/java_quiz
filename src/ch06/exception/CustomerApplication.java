package ch06.exception;

import java.util.Scanner;

public class CustomerApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50];

    public static void main(String[] args) {
        boolean run = true; // 적립
        while (run) {
            System.out.println("-------------");
            System.out.println(" 1.고객등록 | 2. 고객리스트확인 | 3.포인트 적립 | 4.포인트 사용 | 5.프로그램 종료");
            System.out.println("-------------");

            System.out.println("선택> ");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1: createCustomer(); break;
                case 2: customerList(); break;
                case 3: getPoint(); break;
                case 4: usePoint(); break;
                case 5: run = false; break;
            }
        } // switch
        System.out.println("프로그램 종료");
    }

    // 1. 고객 등록하기
    private static void createCustomer() {
        System.out.println("-------------");
        System.out.println("고객 등록");
        System.out.println("-------------");

        System.out.println("고객이름: ");
        String customerName = scanner.next();

        System.out.println("핸드폰 번호: ");
        String tel = scanner.next();

        System.out.println("집 주소: ");
        String address = scanner.next();

        System.out.println("포인트: ");
        int point = scanner.nextInt();

        Customer newCustomer = new Customer(customerName, tel, address, point);

        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] == null) {
                customerArray[i] = newCustomer;
                System.out.println("결과: 고객으로 등록되셨습니다.");
                break;
            }
        }

    }

    // 2. 고객 리스트보기
    private static void customerList() {
        System.out.println("-------------");
        System.out.println("고객 리스트");
        System.out.println("-------------");

        for (int i = 0; i < customerArray.length; i++) {
            Customer customer = customerArray[i];
            if (customer != null) {
                System.out.println(customer.getCustomerName() + " " + customer.getTel() + " " + customer.getAddress() + " " + customer.getPoint());
            } else  {
                break;
            }
        }
    }

    // 3. 포인트 적립(+)
    private static void getPoint() {
        System.out.println("-------------");
        System.out.println("포인트 적립");
        System.out.println("-------------");

        System.out.println("휴대폰 번호: ");
        String tel = scanner.next();

        System.out.println("적립 포인트: ");
        int point = scanner.nextInt();


        // 입력받은 휴대폰번호로 고객이름 찾기
        Customer customer = findCustomer(tel);

        if (customer == null) {
            System.out.println("결과: 고객님 환영합니다");
            return;
        } 
        if (point >= 2000) {
            point *= 1.1;
            System.out.println("10% 추가 적립합니다");
        }
        customer.setPoint((customer.getPoint() + point));

    }

    // 4. 포인트 사용(-)
    private static void usePoint() {
        System.out.println("-------------");
        System.out.println("포인트 사용");
        System.out.println("-------------");

        System.out.println("휴대폰 번호: ");
        String tel = scanner.next();



        // 입력받은 휴대폰번호로 고객이름 찾기
        Customer customer = findCustomer(tel);

        if (customer == null) {
            System.out.println("결과: 고객정보가 없습니다");
            return;
        } if (customer.getPoint() <= 500) {
            System.out.println("500점 이상부터 사용 가능합니다");
            return;
        } else {
            System.out.println("사용 포인트: ");

            int point = scanner.nextInt();

            if (customer.getPoint() < point ) {
                System.out.println("포인트가 부족합니다");
                return;
            }
        customer.setPoint((customer.getPoint() - point));
        }
    }

    // 5. 번호로 고객찾기
    private static Customer findCustomer(String tel) {
        Customer customer = null;
        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] != null) {
                String dbtel = customerArray[i].getTel();

                if (dbtel.equals(tel)) {
                    customer = customerArray[i];
                    break;
                }
            }
        }
        return customer;
    }
}
