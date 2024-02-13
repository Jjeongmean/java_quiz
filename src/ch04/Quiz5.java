package ch04;

public class Quiz5 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++){
            for(int y = 1; y <= 10; y++) {
                //4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성
                if (4*x + 5*y == 60) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }

    }
}
// 반복문을 중첩해서 0부터 10까지 1씩 증가시켜가면서 돌린다.
// 반복과정에서 방정식을 만족시키는 경우에만 x와 y의 값을 출력하면 된다
