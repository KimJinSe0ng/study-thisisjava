package ch03.sec07;

/**
 * <논리 연산자>
 *     && 는 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않고 바로 false를 산출한다.
 *     & 는 두 피연산자 모두를 평가해서 산출 결과를 낸다.
 *     따라서 &보다 &&가 더 효율적이다.
 */
public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        //int charCode = 'a';
        //int charCode = '5';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자");
        }

        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자");
        }

        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자");
        }

        int value = 6;
        //int value = 7;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아님");
        }
    }
}
