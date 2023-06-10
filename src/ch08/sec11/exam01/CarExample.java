package ch08.sec11.exam01;

/**
 * <다형성>
 *     다형성: 사용 방법은 동일하지만 다양한 결과가 나오는 성질
 *     메소드 재정의와 자동 타입 변환을 이용해 다형성을 얻는다.
 *     <필드의 다형성>
 *         자동차는 동일한 타이어 인터페이스로 한국 타이어와 금호 타이어를 사용하지만 각 타이어의 성능은 다르게 나온다.
 */
public class CarExample {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car myCar = new Car();

        // run() 메소드 실행
        myCar.run();

        // 타이어 객체 교체
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        // run() 메소드 실행 -> 다형성: 실행 결과가 다름
        myCar.run();
    }
}
