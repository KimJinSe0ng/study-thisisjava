package ch06.sec07.exam04;

/**
 * <생성자 오버로딩>
 *     매개변수의 타입, 개수, 순서를 달리하는 생성자를 여러 개 선언하는 것
 *     매개변수의 타입, 개수, 순서가 똑같을 경우에 이름만 바꾸는 것은 오버로딩이 아니다.
 *     ex) Car(String model, String color)
 *         Car(String color, String model) // 오버로딩이 아님, 컴파일 에러 발생
 */
public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car(); // (1) 생성자 호출
        System.out.println("car1.company: " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용"); // (2) 생성자 호출
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강"); // (3) 생성자 호출
        System.out.println("car3.company: " + car3.company);
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "검정", 200); // (4) 생성자 호출
        System.out.println("car4.company: " + car4.company);
        System.out.println("car4.model: " + car4.model);
        System.out.println("car4.color: " + car4.color);
        System.out.println("car4.maxSpeed: " + car4.maxSpeed);
        System.out.println();
    }
}
