package ch06.sec13.exam02.package2;
/**
 * <접근 제한자>
 *     public: 클래스, 필드, 생성자, 메소드      -> 제한범위: 없음
 *     protected: 필드, 생성자, 메소드         -> 제한범위: 같은 패키지, 자식 객체만 사용 가능
 *     (default): 클래스, 필드, 생성자, 메소드   -> 제한범위: 같은 패키지
 *     private: 필드, 생성자, 메소드           -> 제한범위: 객체 내부
 * <클래스의 접근 제한>
 *     클래스는 public, default 접근 제한을 가질 수 있다.
 * <생성자의 접근 제한>
 *     생성자는 public, default, private 접근 제한을 가질 수 있다.
 *     public: 모든 패키지에서 생성자를 호출할 수 있다.
 *     (default): 같은 패키지에서만 생성자를 호출할 수 있다.
 *     private: 클래스 내부에서만 생성자를 호출할 수 있다.
 */

import ch06.sec13.exam02.package1.*; // 패키지가 다름

public class C {
    // 필드 선언
    A a1 = new A(true); // O
    //A a2 = new A(1); // X  ->  default 생성자 접근 불가(컴파일 에러)
    //A a3 = new A("문자열"); // X  ->  private 생성자 접근 불가(컴파일 에러)
}
