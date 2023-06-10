package ch07.sec10.exam01;

/**
 * <추상 클래스>
 *     추상: 실체 간에 공통되는 특성을 추출한 것
 *     예를 들어, 새, 곤충, 물고기 등의 공통점은 동물이다. -> Bird, Insect, Fish -> Animal
 *     추상 클래스: 객체를 생성할 수 있는 실체 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스
 *     실체 클래스의 부모 역할을 한다.
 *     따라서 실체 클래스는 추상 클래스를 상속해서 공통적인 필드나 메소드를 물려받을 수 있다.
 *     추상 클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 new 연산자를 사용해서 객체를 직접 생성할 수 없다.
 *     ex) Animal animal = new Animal(); // X
 *     추상 클래스는 새로운 실체 클래스를 만들기 위한 부모 클래스로만 사용된다. extends 뒤에만 올 수 있다.
 *         <추상 클래스 선언>
 *             클래스 선언에 abstract 키워드를 붙이면 된다.
 *             new 연산자를 이용해 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다.
 *             자식 객체가 생성될 때 super() 로 추상 클래스의 생성자가 호출되기 때문에 생성자도 반드시 있어야 한다.
 *             ex) public abstract class 클래스명 {
 *                 // 필드
 *                 // 생성자
 *                 // 메소드
 *             }
 */
public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone(); // X

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn(); // Phone 의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff(); // Phone 의 메소드
    }
}
