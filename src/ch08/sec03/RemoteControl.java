package ch08.sec03;

/**
 * 인터페이스에 선언된 필드는 모두 public static final 특성을 가짐(생략해도 붙음)
 * 추상 메소드: 선언부만 있고 실행부인 중괄호가 없는 메소드
 */
public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}
