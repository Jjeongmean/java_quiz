package ch04;

public class Quiz6 {
    public static void main(String[] args) {
        //두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력
        //1,1 1,2 1,3 1,4 2,1 2,2 2,3 2,4
        for (int x = 1; x <=6 ; x++)
            for (int y = 1; y <=6 ; y++)
                if (x+y==6)
                    System.out.println("(" + x + "," + y + ")");

    }
}
