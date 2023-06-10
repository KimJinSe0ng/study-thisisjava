package ch08.sec07;
/**
 * <인터페이스>
 *     인터페이스에 선언된 필드는 모두 public static final 특성을 가짐(생략해도 붙음)
 *     추상 메소드: 선언부(리턴 타입, 메소드명, 매개변수)만 있고 실행부인 중괄호 {}가 없는 메소드 + public abstract 를 생략해도 자동으로 붙음
 *     + 구현 클래스에서 추상 메소드 재정의할 때 주의할 점은 인터페이스의 추상 메소드는 기본적으로 public 접근 제한을 갖는다. -> 재정의되는 메소드에는 모두 public 을 추가
 *     + 구현 클래스는 디폴트 메소드를 재정의할 수 있다. 주의할 점!!! public 접근 제한자를 반드시 붙여야 하고, default 키워드는 생략해야 한다.
 *     <디폴트 메소드>
 *         완전한 실행 코드를 가진 디폴트 메소드이다.
 *         추상 메소드는 실행부 {} 가 없지만, 디폴트 메소드는 {} 가 있다.
 *         선언 방법은 클래스 메소드와 동일하다. 차이점은 default 키워드가 리턴 타입 앞에 붙는다.
 *         디폴트 메소드를 재정의할 때 주의할 점!!! public 접근 제한자를 반드시 붙여야 하고, default 키워드는 생략해야 한다.
 *     <정적 메소드>
 *         선언 방법은 클래스 정적 메소드와 완전 동일하다. 차이점은 public 을 생략하더라도 자동으로 붙는다.
 *         구현 객체 필요 없이 인터페이스만으로도 호출할 수 있다.
 *         정적 메소드의 실행부{} 를 작성할 때 주의할 점!!! 상수 필드를 제외한 추상 메소드, 디폴트 메소드, private 메소드 등을 호출할 수 없다.
 *         why? 이 메소드는 구현 객체가 필요한 인스턴스 메소드이기 때문이다.
 *     <private 메소드>
 *         인터페이스의 상수 필드, 추상 메소드, 디폴트 메소드, 정적 메소드는 모두 public 접근 제한을 갖는다. 생략해도 붙는다.
 *         외부에서 접근할 수 없는 private 메소드 선언도 가능하다.
 *         + private 메소드는 디폴트 메소드 안에서만 호출이 가능
 *         + private 정적 메소드는 디폴트 메소드 뿐만 아니라 정적 메소드 안에서도 호출이 가능
 */
public interface Service {
    // 디폴트 메소드
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    // private 메소드
    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    // 정적 메소드
    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    // private 정적 메소드
    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }
}
