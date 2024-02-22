package ch07.Quiz011;

public class MainActivity extends Activity{
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }
}
/*
답: super
풀이: 이 문제는 자식 메소드 내에서 부모 메소드를 호출하는 것인데, 다음과 같이 super 키워드와
도트(.) 연산자를 사용하면 숨겨진 부모 메소드를 호출할 수 있다.
 */
