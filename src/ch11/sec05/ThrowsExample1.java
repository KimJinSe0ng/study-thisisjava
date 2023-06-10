package ch11.sec05;

/**
 * <예외 떠넘기기>
 *     메소드 내부에서 예외 발생시 try-catch 블록으로 예외를 처리하는 것이 기본이지만, throws 키워드를 통해 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다.
 *     떠넘길 예외 클래스를 쉼표로 구분해서 나열해준다.
 *     ex) 리턴타입 메소드명(매개변수, ...) throws 예외클래스1, 예외클래스2, ... {...}
 *     따라서 throws 키워드가 붙어 있는 메소드에서 예외를 넘겼기 때문에 이 메소드를 호출하는 곳에서 예외를 받아 처리해야 한다.
 */
public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) { // 호출한 곳에서 예외 처리
            System.out.println("예외 처리: " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
