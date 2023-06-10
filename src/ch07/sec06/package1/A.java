package ch07.sec06.package1;
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
 * <필드와 메소드의 접근 제한>
 *     필드와 메소드는 public, default, private 접근 제한을 가질 수 있다.
 *     public: 모든 패키지에서 필드를 읽고 변경할 수 있고 메소드를 호출할 수 있다.
 *     protected: 같은 패키지이거나, 자식 객체만 사용 가능하다.
 *     (default): 같은 패키지에서만 필드를 읽고 변경할 수 있고 메소드를 호출할 수 있다.
 *     private: 클래스 내부에서만 필드를 읽고 변경할 수 있고 메소드를 호출할 수 있다.
 */
public class A {
    // 필드 선언
    protected String field;

    // 생성자 선언
    protected A() {

    }

    // 메소드 선언
    protected void method() {

    }
}
