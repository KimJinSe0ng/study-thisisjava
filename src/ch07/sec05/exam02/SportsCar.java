package ch07.sec05.exam02;

/**
 * <final 클래스>
 *     클래스를 선언할 때 final 키워드를 클래스 앞에 붙이면 최종적인 클래스이므로 더 이상 상속할 수 없는 클래스가 된다.
 *     final 클래스는 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없다.
 *     대표적인 예: String 클래스
 * <final 메소드>
 *     메소드를 선언할 때 final 키워드를 메소드 앞에 붙이면 최종적인 메소드이므로 오버라이딩할 수 없는 메소드가 된다.
 *     부모 클래스를 상속해서 자식 클래스를 선언할 때, 부모 클래스에 선언된 final 메소드는 자식 클래스에서 재정의할 수 없다.
 */
public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    // 오버라이딩을 할 수 없음
    /*
    @Override
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
     */
}
