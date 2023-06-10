package ch06.sec11.exam01;

/**
 * <final 필드와 상수>
 *     final 필드는 초기값이 저장되면 변경이 불가능하다.
 *     1. 필드 선언 시에 초기값 대임
 *     2. 생성자에서 초기값 대임
 *     + 고정된 값이라면 필드 선언 시에 주는 것이 제일 간단하다.
 *     + 복잡한 초기화 코드가 필요하거나 객체 생성 시에 외부에서 전달된 값으로 초기화한다면 생성자에서 해야 한다.
 *     + 이 두 방법을 사용하지 않고 final 필드를 그대로 남겨두면 컴파일 에러가 발생한다.
 */
public class Korean {
    // 인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
