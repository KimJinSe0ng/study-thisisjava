package ch06.sec13.exam01.package2; // 패키지가 다름
/**
 * <접근 제한자>
 *     public: 클래스, 필드, 생성자, 메소드      -> 제한범위: 없음
 *     protected: 필드, 생성자, 메소드         -> 제한범위: 같은 패키지, 자식 객체만 사용 가능
 *     (default): 클래스, 필드, 생성자, 메소드   -> 제한범위: 같은 패키지
 *     private: 필드, 생성자, 메소드           -> 제한범위: 객체 내부
 * <클래스의 접근 제한>
 *     클래스는 public, default 접근 제한을 가질 수 있다.
 */

import ch06.sec13.exam01.package1.*;

public class C {
    // 필드 선언
    //A a; // (X) A 클래스 접근 불가(컴파일 에러)
    B b; // (O)
}
