package ch05.sec05;

/**
 * <문자열(String) 타입>
 *     자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 설계되어 있음
 *     String 변수에 문자열 리터럴을 대입하는 것이 일반적이지만,
 *     new 연산자로 직접 String 객체를 생성하고 대입할 수도 있다. 이 경우, 서로 다른 String 객체의 번지를 가지게 됨
 *     빈 문자열("")을 대입할 수도 있다. -> 빈 문자열도 String 객체로 생성된다.
 */
public class EqulasExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
