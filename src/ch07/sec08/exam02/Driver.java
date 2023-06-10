package ch07.sec08.exam02;
/**
 * <다형성>
 *     사용 방법은 동일하지만 실행 결과가 다양하게 나오는 성질
 *     예를 들어, 자동차의 부품을 교환하면 성능이 다르게 나오듯이 객체는 부품과 같아서, 프로그램을 구성하는 객체를 바꾸면 프로그램의 실행 성능이 다르게 나올 수 있다.
 *     객체 사용 방법이 동일하다 = 동일한 메소드를 가지고 있다.
 *     다형성을 구현하기 위해서는 자동 타입 변환과 메소드 재정의가 필요하다.
 *     ex) 한국 타이어와 금호 타이어는 모두 타이어를 상속한다. -> 한국 타이어와 금호 타이어는 타이어(부모)의 메소드를 동일하게 갖고 있다.
 *         만약 한국 타이어와 금호 타이어가 타이어(부모)의 메소드를 오버라이딩 하고 있다면, 타이어 메소드 호출 시 오버라이딩된 메소드가 호출된다.
 *         오버라이딩 된 내용은 두 타이어가 다르기 때문에 실행 결과가 다르게 나온다. -> 다형성
 *     <필드 다형성>
 *         필드 타입은 동일하지만(사용 방법은 동일하지만), 대입되는 객체가 달라져서 실행 결과가 다양하게 나올 수 있는 것을 말한다.
 *     <매개변수 다형성>
 *         다형성은 필드보다는 메소드를 호출할 때 많이 발생한다.
 *         메소드가 클래스 타입의 매개변수를 가지고 있을 경우, 호출할 때 동일한 타입의 객체를 제공하는 것이 정석이지만 자식 객체를 제공할 수도 있다. 여기서 다형성이 발생한다.
 *         drive(Vehicle vehicle) 메소드를 실행할 때, 자동 타입 변환으로 인해 Vehicle 의 자식 객체도 제공할 수 있다.
 */
public class Driver {
    // 메소드 선언(클래스 타입의 매개변수를 가지고 있음)
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
