package ch11;

public class Quiz06 {
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value = 0;

        for (int i = 0; i <= 2 ; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했음");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            } finally {
                System.out.println(value);
            }
        }

    }
}
/*
1. value = 10 -> 10 출력
2. value = 2a -> NumberFormatException 예외 발생 : 숫자로 변환할 수 없음 출력
3. 여전히 value = 10 -> finally는 항상 실행이므로 10 출력
4. strArray의 인덱스는 0,1 뿐인데 인덱스로 2가 들어오게 됨 -> ArrayIndexOutOfBoundsException 예외 발생 : 인덱스를 초과했음 출력
5. 여전히 value = 10 -> finally는 항상 실행이므로 10 출력
 */

/*
 1. i가 0일때 변수 value에는 10이 들어간다
    finally에서 value 값인 10을 출력.

    출력 결과 ➡ 10

 2. i가 1일때 정수화가 되지 못해서 NumberFormatException이 실행되어
    "숫자로 변환할 수없음" 이라는 문구가 실행된다.
    + finally에서 value 값인 전의 10값이 함께 출력된다.

    출력 결과 ➡ 숫자로 변환할 수 없음 10

 3. i가 2가 될때 배열엥서 2가 없어서 ArrayIndexOutOfBoundsException이 실행
    "인덱스를 초과했음" 이라는 문구가 실행된다.
    + finally에서 value값인 전의 10값이 함께 출력된다.

    출력 결과 ➡ 인덱스를 초과했음 10
 */
