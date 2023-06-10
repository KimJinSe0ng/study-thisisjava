package ch06.sec08.exam02;

/**
 * <가변길이 매개변수>
 *     매개값들은 자동으로 배열 항목으로 변환되어 메소드에서 사용된다.
 *     직접 배열을 매개값으로 제공해도 된다.
 */
public class Computer {
    // 가변길이 매개변수를 갖는 메소드 선언
    int sum (int ... values) {
        // sum 변수 선언
        int sum = 0;

        // values 는 배열 타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // 합산 결과를 리턴
        return sum;
    }
}
