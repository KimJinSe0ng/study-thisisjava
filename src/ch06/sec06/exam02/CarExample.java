package ch06.sec06.exam02;

/**
 * <필드 사용>
 *     클래스로부터 객체가 생성된 후에 필드를 사용할 수 있다.
 *     필드는 객체 내부의 생성자와 메소드 내부에서 사용할 수 있고, 객체 외부에서도 접근해서 사용할 수 있다.
 */
public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        // Car 객체의 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
}
