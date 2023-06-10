package ch03.sec01;

/**
 * <나눗셈 연산 후 NaN과 Infinity 처리>
 *     나눗셈(/) 또는 나머지(%) 연산에서 좌측 피연산자가 정수이고, 우측 피연산자가 0일 경우 예외가 발생함
 *     하지만 좌측 피연산자가 실수이거나 우측 피연산자가 0.0 또는 0.0f이면 예외가 발생하지 않고
 *     Infinity(무한대) , NaN(Not a Number)이 된다.
 */
public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        //double z = x % y;
        // 잘못된 코드, 13과 14라인을 번갈아가며 실행해보자.
        System.out.println(z + 2);

        // 알맞은 코드
        if (Double.isInfinite(z) || Double.isNaN(z)) { // Infinity or NaN 체크해주는 함수
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
        
    }
}
