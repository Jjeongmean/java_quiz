package ch05;

public class Quiz9 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        //합과 평균 구하기
        int sum = 0; //누적합산을 위해 반복문 바깥에 입력한다
        int count = 0; //배열 원소의 개수

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; // 배열 원소를 하나씩 가져와서 누적합산
                count++; // 배열 원소의 갯수만큼 카운트
            }
        }
        double avg = (double) sum / count;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);



        /*
        int sum = 0; // 정수형 초기값
        double avg = 0.0; // 정수형 초기값

        int cnt = 0; // count

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                sum += array[i][j];
            }
            cnt += array[i].length;
        }
        avg = (double) sum / cnt;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);

         */
    }
}
