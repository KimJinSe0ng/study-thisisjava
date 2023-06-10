package ch11.sec02.exam02;
/**
 * <예외 처리 코드>
 *     예외가 발생했을 때 프로그램의 갑작스러운 종료를 막고 정상 실행을 유지하도록 처리하는 코드
 *     try-catch-finally 블록으로 구성되고, 생성자 내부와 메소드 내부에서 작성된다.
 *     예외 발생 여부와 상관없이 finally 블록은 항상 실행된다.
 *     + try 블록과 catch 블록에서 return 문(메소드 종료)을 사용하더라도 finally 블록은 항상 실행된다.
 *     </예외>
 *     + NullPointerException : 참조 변수가 null인 상태에서 필드나 메소드에 접근할 경우 발생
 *     + Class.forName("패키지...클래스") ClassPath 위치에서 주어진 클래스를 찾는 코드 -> 못 찾으면 ClassNotFoundException 발생
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String"); // ClassNotFoundException 발생 가능 코드
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2"); // ClassNotFoundException 발생 가능 코드
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
