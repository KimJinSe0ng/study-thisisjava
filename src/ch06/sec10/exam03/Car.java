package ch06.sec10.exam03;

/**
 * <인스턴스 멤버 사용 불가>
 *     정적 메소드와 정적 블록은 객체가 없어도 실행된다는 특징 때문에 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
 *     또한 객체 자신의 참조인 this 도 사용할 수 없다.
 *     + !! 인스턴스 멤버를 사용하고 싶다면 다음과 같이 객체를 먼저 생성하고 참조 변수로 접근해야 한다.
 *
 */
public class Car {
    // 인스턴스 필드 선언
    int speed;

    // 인스턴스 메소드 선언
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        //this.speed = 60; // 컴파일 에러
        //this.run(); // 컴파일 에러
        // 객체 생성
        Car myCar = new Car(); // + !! 인스턴스 멤버를 사용하고 싶다면 다음과 같이 객체를 먼저 생성하고 참조 변수로 접근해야 한다.
        // 인스턴스 멤버 사용
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) { // main() 메소드도 정적 메소드이므로 객체 생성 없이 인스턴스 필드, 메소드를 사용할 수 없다.
        //speed = 60; // 컴파일 에러
        //run(); // 컴파일 에러
        // 정적 메소드 호출
        simulate();

        // 객체 생성
        Car myCar = new Car();
        // 인스턴스 멤버 사용
        myCar.speed = 60;
        myCar.run();
    }
}
