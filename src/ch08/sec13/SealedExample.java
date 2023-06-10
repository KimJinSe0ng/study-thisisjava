package ch08.sec13;

/**
 * <봉인된 인터페이스>
 *     Java 15 부터는 무분별한 자식 인터페이스 생성을 방지하기 위해 sealed 를 사용할 수 있다.
 *     A 의 자식 인터페이스는 B 만 가능하고, 그 이외는 못하게 하려면
 *     ex) public sealed interface InterfaceA permits InterfaceB
 *     sealed 사용 후 permits 키워드 뒤에 상속 가능한 자식 인터페이스를 지정해야 한다.
 *     봉인된 A 를 상속하는 B는 sealed 를 사용해 또 다른 봉인된 인터페이스로 선언하거나 non-sealed 키워드를 사용해 봉인을 해제해야 한다.
 *     non-sealed : 다른 자식 인터페이스를 만들 수 있다.
 */
public class SealedExample {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();

        InterfaceA ia = impl;
        ia.methodA();

        System.out.println();

        InterfaceB ib = impl;
        ib.methodA();
        ib.methodA();

        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
