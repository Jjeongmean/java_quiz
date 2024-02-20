package ch06.Quiz20;

public class Example {
    //isNumber() 메소드 작성
    static boolean isNumber(String str) {
        if (str == null || str.equals(""))  // 넘겨받은 문자열(str)이 null이거나 빈 문자열("")이면 false 반환한다.
            return false;

        for (int i = 0; i < str.length(); i++) { // 반복문(for) 과
                char ch = str.charAt(i); //charAt(int i)을 이용해서 문자열에서 한 문자씩 차례대로 읽어와 char타입의 변수 ch에 저장

            //자동타입 변환이 일어나면서 유니코드로 비교한다
            //유니코드는 0~9 사이의 숫자만 존재한다
            if (ch < '0' || ch > '9')  // if (!('0' <= ch && ch <= '9')) 와 같다
                    return false; // 메소드 종료, 읽온 문자(ch)가 숫자가 아니면 false를 반환한다
            } // for
        return true; // for문을 무사히 빠져나왔다는 건 str값이 모두 숫자
    }
    public static void main(String[] args) {
        String str = "213";
        System.out.println(str +"는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str +"는 숫자입니까? " + isNumber(str));
    }

}
