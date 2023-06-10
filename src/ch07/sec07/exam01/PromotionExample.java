package ch07.sec07.exam01;

/**
 * <타입 변환>
 *     클래스의 타입 변환은 상속 관계에 있는 클래스 사이에서 발생한다.
 *     바로 위의 부모가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환이 일어난다.
 */
class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 자동 타입 변환(상속 관계에 있음)
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // 컴파일 에러(상속 관계에 있지 않음)
        //B b3 = e;
        //C c2 = d;
    }
}
