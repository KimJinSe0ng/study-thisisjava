package ch11.sec05;
/**
 * <예외 떠넘기기>
 *     메소드 내부에서 예외 발생시 try-catch 블록으로 예외를 처리하는 것이 기본이지만, throws 키워드를 통해 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다.
 *     떠넘길 예외 클래스를 쉼표로 구분해서 나열해준다.
 *     ex) 리턴타입 메소드명(매개변수, ...) throws 예외클래스1, 예외클래스2, ... {...}
 *     따라서 throws 키워드가 붙어 있는 메소드에서 예외를 넘겼기 때문에 이 메소드를 호출하는 곳에서 예외를 받아 처리해야 한다.
 *     + 나열해야 할 클래스가 많을 경우 throws Exception 또는 throws Throwable 만으로 모든 예외를 간단히 떠넘길 수 있다.
 *     + main() 메소드에서도 예외를 넘길 수 있는데, 결국 JVM 이 최종적으로 예외 처리를 하게 된다.
 *     + JVM 은 예외 내용을 콘솔에 출력하는 것으로 예외 처리를 한다.
 */
public class ThrowsExample2 {
    public static void main(String[] args) throws Exception{
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
