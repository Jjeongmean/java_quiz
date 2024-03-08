package ch15.Quiz09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; //최고 점수를 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수

        double averageScore; // 평균 점수를 저장하는 변수

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            int score = e.getValue();
            totalScore += score;

            if (e.getValue() > maxScore) {
                name = e.getKey();
                maxScore = score;
            }
        }
        averageScore = (double) totalScore / map.size();

        System.out.printf("평균 점수: %.1f\n", averageScore);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
