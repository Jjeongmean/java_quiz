package ch05;

public class Quiz8 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = 0;

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) { // 최솟갑은 ' > ' 사용.
                max = array[i];
            }
        }
        System.out.println("max: " + max);
    }
}
