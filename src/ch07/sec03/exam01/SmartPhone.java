package ch07.sec03.exam01;

/**
 * <부모 생성자 호출>
 *     자식 객체를 생성하면 부모 객체가 먼저 생성된 다음에 자식 객체가 생성된다.
 *     super() 는 부모의 기본 생성자를 호출한다.
 *     만약 부모 클래스에 기본 생성자가 없다면 자식 생성자 선언에서 컴파일 에러가 발생한다.
 *     부모 클래스에 매개변수를 갖는 생성자만 있다면 super(매개값, ...) 코드를 넣어야 한다.
 */
public class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super(); // 생략 가능(컴파일 시 자동 추가됨)
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
