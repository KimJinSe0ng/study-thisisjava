package ch07.sec07.exam03;
/**
 * <타입 변환>
 *     클래스의 타입 변환은 상속 관계에 있는 클래스 사이에서 발생한다.
 *     바로 위의 부모가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환이 일어난다.
 *     + 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만!!! 접근이 가능하다.
 *     + 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정된다.
 *     + 그러나!! 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다!!!
 *     + 다형성과 관련 있기 때문에 잘 알아두어야 한다.
 *     >> 자동 타입 변환: 부모타입 변수 = 자식타입객체;
 * <강제 타입 변환>
 *     부모 타입은 자식 타입으로 자동 변환되지 않는다.
 *     자식 객체가 부모 타입으로 자동 변환되면 부모 타입에 선언된 필드와 메소드만 사용가능한데,
 *     만약, 자식 타입에 선언된 필드와 메소드를 꼭 사용해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로 변환해야 한다.
 *     >> 강제 타입 변환: 자식타입 변수 = (자식타입) 부모타입객체;
 */
public class ChildExample {
    public static void main(String[] args) {
        // 객체 생성 및 자동 타입 변환
        Parent parent = new Child();

        // Parnet 타입으로 필드와 메소드 사용
        parent.field1 = "dara1";
        parent.method1();
        parent.method2();
        /*
        parent.field2 = "data2"; // 불가능
        parent.method3(); // 불가능
         */

        // 강제 타입 변환
        Child child = (Child) parent;

        // Child 타입으로 필드와 메소드 사용
        child.field2 = "data2"; // 가능
        child.method3(); // 가능
    }
}
