package ch04.sec02;

/**
 * <IF문 연습>
 *     Math.random() 메소드는 0.0 <= ~ < 1.0 사이의 double 타입의 난수를 리턴한다.
 *     ex) Math.random() * 45는 0.0 <= ~ < 45.0 이다.
 */
public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) + 1; // 주사위 번호 하나 뽑기 1 <= ~ < 7

        if(num == 1) {
            System.out.println("1번");
        } else if (num == 2) {
            System.out.println("1번");
        } else if (num == 3) {
            System.out.println("3번");
        } else if (num == 4) {
            System.out.println("4번");
        } else if (num == 5) {
            System.out.println("5번");
        } else {
            System.out.println("6번");
        }
    }
}
