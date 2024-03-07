package ch11;

public class Quiz05 {
    public void method1() throws NumberFormatException, ClassNotFoundException{
        try { method1( ); }
        catch (Exception e) { } // catch 블록을 두개 이상 사용시 Exception 은 항상 아래에!!
       // catch (ClassNotFoundException e) { }

        /*
        답: 3번
        풀이: Exception을 앞을 두게 되면 뒤에 있는 객체는 결코 실행되지 않는다. (두개의 위치가 변경되어야함, 순서가 잘못됨)
        1번-모든 예외처리가능, 2번-throws로 떠넘기기 사용, 4번- 두개의 예외 처리


        처리해야 할 예외 클래스들이 상속 관계에 있을 때는 하위 클래스 catch 블록을 먼저 작성하고 상위 클래스
        catch 블록을 나중에 작성해야 한다. 그 이유는 예외가 발생하면 catch 블록은 위에서부터 차례대로 검사 대상이 되는데,
        하위 예외(ClassNotFoundException)도 상위 클래스 타입이므로 상위클래스 catch 블록(Exception)이 먼저
        검사 대상이 되면 안된다.
        하위 예외 클래스를 나중에 작성할 시 먼저 상위 예외 클래스가 실행되어 하위 예외 클래스는 실행되지 않는다.
         */
    }

}
