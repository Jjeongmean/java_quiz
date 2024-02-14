package ch05;

public class Quiz7 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int arrs : arr) {
            System.out.println(arrs);
            sum += arrs;
        }
        System.out.println("합계: " + sum);
    }
}
