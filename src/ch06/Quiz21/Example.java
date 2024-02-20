package ch06.Quiz21;

public class Example {

    //max 메소드 작성
    static int max(int[] arr) {
        //매개변수로 넘겨받은 배열 arr이 null이거나 크기가 0이면 -999999을 반환된다.
        if ( arr == null || arr.length == 0) {
            return -999999;
        }

        //배열의 첫번째 요소(arr[0])로 최대값(max)을 초기화한다.
        int max = arr[0]; // 배열의 첫번째 값으로 최대값을 초기화한다.
        //최대값 max를 배열의 첫번째 값으로 초기화 했으므로 첫번째 값은 비교할 필요가 없다.


        //그래서 두번째 값(arr[1])부터 비교한다. 비교해서 최대값보다 크면 그 값을 변수 max에 저장한다.
        for (int i = 0; i < arr.length; i++) { // 배열의 두번째 값부터 비교한다.
            if (arr[i] > max ) max = arr[i];
        }
        // 반복문을 다 돌고 나면, max에는 배열의 요소 중 가장 큰 값이 저장되어 있을것이다.
        // 이 값을 반환한다.
        return max;
    }

    public static void main(String[] args) {
        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
    }
}
