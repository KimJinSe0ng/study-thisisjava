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
public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); // data가 null일 경우 NullPointerException 발생
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            // 예외 정보를 얻는 3가지 방법
            // 예외가 발생하면 예외 객체가 catch 선언부의 예외 클래스 변수에 대입된다.
            System.out.println(e.getMessage()); // e.getMessage() : 예외가 발생한 이유만 리턴
            System.out.println(e.toString()); // e.toString() : 예외의 종류 + 발생 이유 리턴
            e.printStackTrace();            // e.printStackTrace() : 예외가 어디서 발생했는지 추적한 내용까지 출력한다.
        } finally {
            System.out.println("마무리 실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
