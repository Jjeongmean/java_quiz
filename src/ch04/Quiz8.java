package ch04;

public class Quiz8 {
    public static void main(String[] args) {
        for (int i = 1; i<=5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            if (j == i) System.out.println();
            }
        }
    }
}
