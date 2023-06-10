package ch03.sec01;

/**
 * <부호 변경>
 * 부호를 변경하는 것도 연산이므로 타입 변환을 해주어야 한다.
 */
public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y: " + y);

    }
}
