package ch07.sec07.exam02;
/**
 * <타입 변환>
 *     클래스의 타입 변환은 상속 관계에 있는 클래스 사이에서 발생한다.
 *     바로 위의 부모가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환이 일어난다.
 *     + 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만!!! 접근이 가능하다.
 *     + 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정된다.
 *     + 그러나!! 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다!!!
 *     + 다형성과 관련 있기 때문에 잘 알아두어야 한다.
 */
public class Child extends Parent {
    // 메소드 오버라이딩
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    // 메소드 선언
    public void method3() {
        System.out.println("Child-method3()");
    }
}
