package ch07.Quiz;

public class quiz {
    /*
    1. 자바의 상속에 대한 설명 중 틀린 것은 무엇입니까?
            ➊ 자바는 다중 상속을 허용한다.
            ➋ 부모의 메소드를 자식 클래스에서 재정의(오버라이딩)할 수 있다.
            ➌ 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니다.
            ➍ final 클래스는 상속할 수 없고, final 메소드는 오버라이딩할 수 없다.
            답: 1
            풀이: 자바는 다른 언어와는 달리 다중 상속을 허용하지 않는다

            2. 클래스 타입 변환에 대한 설명 중 틀린 것은 무엇입니까?
            ➊ 자식 객체는 부모 타입으로 자동 타입 변환된다.
            ➋ 부모 객체는 어떤 자식 타입으로도 강제 타입 변환된다.
            ➌ 자동 타입 변환을 이용해서 필드와 매개변수의 다형성을 구현한다.
            ➍ 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다.
            답 2
            풀이: 강제타입변환은 자식 객체가 부모 타입으로 자동변환된 후
                 다시 자식 타입으로 변환할 때 강제타입변환을 사용할 수 있다.
            ➍ 풀이: instanceof 연산자는 변수가 참조하는 객체의 타입을 확인하고자 할때 사용하는 연산자이다

            3. final 키워드에 대한 설명으로 틀린 것은 무엇입니까?
            ➊ final 클래스는 부모 클래스로 사용할 수 있다.
            ➋ final 필드는 초기화된 후에는 변경할 수 없다.
            ➌ final 메소드는 재정의(오버라이딩)할 수 없다.
            ➍ static final 필드는 상수를 말한다.
            답 1
            풀이: final 키워드가 class 앞에 붙게 되면 이는 최종적인 클래스가 되므로 더이상 상속할 수 없는 클래스가 된다.
                 즉 final 클래스는 부모클래스가 될 수 없어 자식 클래스를 만들 수 없다.

            4. 오버라이딩(Overriding)에 대한 설명으로 틀린 것은 무엇입니까?
            ➊ 부모 메소드의 시그너처(리턴 타입, 메소드명, 매개변수)와 동일해야 한다.
            ➋ 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다.(예: public (부모)  private (자식) ).
            ➌ @Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.
            ➍ protected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의할 수 없다.
            답: 4
            풀이: protected는 같은 패키지에서는 default처럼 접근이 가능하나, 다른 패키지에서는 자식 클래스만 접근을 허용한다.
                 즉, 같은 패키지이거나 자식 객체일 경우 접근을 허용함.

            5. 추상 클래스에 대한 설명으로 틀린 것은 무엇입니까?
            ➊ 직접 객체를 생성할 수 없고, 상속만 할 수 있다.
            ➋ 추상 메소드를 반드시 가져야 한다.
            ➌ 추상 메소드는 자식 클래스에서 재정의(오버라이딩)할 수 있다.
            ➍ 추상 메소드를 재정의하지 않으면 자식 클래스도 추상 클래스가 되어야 한다.
            답: 2
            풀이: 추상 클래스는 자식 객체가 생성될 때 super()로 추상 클래스의 생성자가 호출되기 때문에
                 생성자가 반드시 있어야 한다.


     */
}
