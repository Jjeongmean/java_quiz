package ch04;

public class Quiz7 {
    public static void main(String[] args) {
        // Fibonnaci 수열의 시작의 첫 두 숫자를 1,1로 한다
        int num1 =1; // 첫번째 값
        int num2 =1; // 두번째 값
        int num3 =0; // 세번째 값

        //10번째 수열의 값
        System.out.println(num1 + "," + num2);

        for (int i = 0; i < 8; i++) { // 이미 위에서 수열의 첫번째, 두번째 값을 출력했으므로 8번만 반복을 하면된다
            num3= num1 + num2;//세번째 값은 첫번째와 두번째 값을 더해서 얻는다(세번째 값을 만든다)
            System.out.println(num3);//세번째 수열 출력
            num1=num2;//두번째 수열을 첫 번째 값으로 만든다
            num2=num3;//세번째 수열을 두번째 값으로 만든다
        }
    }
}
