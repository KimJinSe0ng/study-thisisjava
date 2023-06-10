package ch07.sec04.exam02;

/**
 * <부모 메소드 호출>
 *     메소드를 재정의하면, 부모 메소드는 숨겨지고 자식 메소드만 사용되기 때문에 비록 부모 메소드의 일부만 변경된다 하더라도 중복된 내용을 자식 메소드도 가지고 있어야 한다.
 *     예를 들어, 부모 메소드가 100줄의 코드를 가지고 있을 경우,
 *     자식 메소드에서 1줄만 추가하고 싶더라도 100줄의 코드를 자식 메소드에서 다시 작성해야 한다.
 *     + 해결 방법으로는,
 *     + 자식 메소드 내에서 부모 메소드를 호출하는 것이다.
 *     + super 키워드와 도트(.) 연산자를 사용하면 숨겨진 부모 메소드를 호출할 수 있다.
 */
public class SupersonicAirplane extends Airplane{
    // 상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    // 상태 필드 선언
    public int flyMode = NORMAL;

    // 메소드 재정의
    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            // Airplane 객체의 fly() 메소드 호출
            super.fly();
        }
    }
}
