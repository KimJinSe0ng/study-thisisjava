package ch07.sec04.exam01;

/**
 * <메소드 재정의>
 *     메소드 오버라이딩: 상속된 메소드를 자식 클래스에서 재정의하는 것
 *     메소드가 오버라이딩 되었다면 해당 부모 메소드는 숨겨지고, 자식 메소드가 우선적으로 사용된다.
 *     <메소드 오버라이딩 할 때 주의해서 작성해야 한다.>
 *         부모 메서드의 선언부(리턴 타입, 메소드 이름, 매개변수)와 동일해야 한다.
 *         접근 제한을 더 강하게 오버라이딩 할 수 없다.(public -> private 으로 변경 불가)
 *         새로운 예외를 throws 할 수 없다.
 */
public class Computer extends Calculator{
    // 메소드 오버라이딩
    @Override // 컴파일 시 정확히 오버라이딩이 되었는지 체크해 줌(생략 가능) -> 문제가 있다면 컴파일 에러를 출력한다.
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
