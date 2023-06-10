package ch08.sec09;

/**
 * <인터페이스 상속>
 *     인터페이스도 다른 인터페이스를 상속할 수 있다.
 *     클래스와 달리 다중 상속을 허용한다.
 *     extends 키워드 뒤에 상속할 인터페이스들을 나열한다.
 *     public interface 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2 {...}
 *     + 자식 인터페이스의 구현 클래스는 자식 인터페이스와 부모 인터페이스의 모든 추상 메소드를 재정의해야 한다.
 *     + 구현 객체가 자식 인터페이스 변수에 대입되면 -> 자식, 부모 인터페이스의 추상 메소드를 모두 호출 가능
 *     +          부모 인터페이스 변수에 대입되면 -> 부모 인터페이스에 선언된 추상 메소드만 호출 가능
 */
public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        //ia.methodB();
        System.out.println();

        InterfaceB ib = impl;
        //ib.methodA();
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
