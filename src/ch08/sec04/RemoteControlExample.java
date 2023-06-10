package ch08.sec04;
/**
 * 인터페이스에 선언된 필드는 모두 public static final 특성을 가짐(생략해도 붙음)
 * 추상 메소드: 선언부(리턴 타입, 메소드명, 매개변수)만 있고 실행부인 중괄호 {}가 없는 메소드 + public abstract 를 생략해도 자동으로 붙음
 * + 구현 클래스에서 추상 메소드 재정의할 때 주의할 점은 인터페이스의 추상 메소드는 기본적으로 public 접근 제한을 갖는다. -> 재정의되는 메소드에는 모두 public 을 추가
 */
public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // Televison 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
