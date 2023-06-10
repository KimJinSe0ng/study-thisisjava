package ch02.sec13;
/**
 * <키보드 입력 데이터를 변수에 저장>
 * nextLine() : Enter 키가 입력되기 전까지 대기 상태, Enter 키가 입력되면 지금까지 입력된 모든 내용을 문자열로 읽는다.
 * 기본 타입(byte, short, int, long ...) 값이 동일한지 비교할 때는 ==를 사용한다.
 * String 타입 값이 동일한지 비교할 때는 equals()를 사용한다.
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.println("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y : " + result);
        System.out.println();

        while (true) {
            System.out.println("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
