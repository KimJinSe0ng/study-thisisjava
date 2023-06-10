package ch06.sec10.exam01;
/**
 * <정적 멤버>
 *     정적 필드와 정적 메소드로 선언하려면 static 키워드를 추가하면 된다.
 *     객체마다 가지고 있을 필요성이 없는 공용적인 필드는 정적 필드로 선언하는 것이 좋다.
 *     예를 들어, Calculator 클래스에서 원의 넓이나 둘레를 구할 때 필요한 파이는 Calculator 객체마다 가지고 있을 필요가 없기 때문에 정적 필드로 선언하는 것이 좋다.
 *     인스턴스 필드를 이용하지 않는 메소드는 정적 메소드로 선언하는 것이 좋다.
 *     예를 들어, Calculator 의 plus() 메소드는 외부에서 주어진 매개값들을 가지고 처리하므로 정적 메소드로 선언하는 것이 좋다.
 *     그러나 인스턴스 필드인 color 를 변경하는 setColor() 메소드는 인스턴스 메소드로 선언해야 한다.
 *     + 정적 필드와 정적 메소드는 클래스 이름과 함께 도트(.) 연산자로 접근하면 된다.
 *     + 정적 필드와 정적 메소드는 객체 참조 변수로도 접근이 가능하다.
 *     + 하지만! 정적 요소는 클래스 이름으로 접근하는 것이 정석이다. 이클립스에서는 경고 표시가 뜬다.
 */
public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
