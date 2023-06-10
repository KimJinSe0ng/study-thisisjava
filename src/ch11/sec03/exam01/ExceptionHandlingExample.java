package ch11.sec03.exam01;

/**
 * <예외 종류에 따른 처리>
 *     다중 catch 를 사용하면 발생하는 예외에 따라 예외 처리 코드 작성 가능
 *     catch 블록이 여러 개라 할지라도 catch 블록은 예외에 해당하는 단 하나만 실행된다.
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]" + value);
            } catch (ArrayIndexOutOfBoundsException e) { // 배열의 인덱스가 초과되었을 경우 발생
                // 잘못된 문자를 숫자로 파싱하려는 경우 발생
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (NumberFormatException e) { // 숫자타입이 아닐 때 발생
                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            }
        }
    }
}
