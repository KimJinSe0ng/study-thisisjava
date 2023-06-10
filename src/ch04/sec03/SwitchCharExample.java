package ch04.sec03;

/**
 * switch 문의 괄호에는 정수 타입과 문자열 타입 변수를 사용할 수 있다.
 */
public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Good");
                break;
            case 'B':
            case 'b':
                System.out.println("Normal");
                break;
            default:
                System.out.println("Bad");
        }

        String grade1 = "AA";

        switch (grade1) {
            case "AA":
            case "aa":
                System.out.println("Good");
                break;
            case "BB":
            case "bb":
                System.out.println("Normal");
                break;
            default:
                System.out.println("Bad");
        }
    }
}
