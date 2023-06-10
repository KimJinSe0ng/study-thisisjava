package ch04.sec03;
/**
 * <Switch문 연습>
 *     Math.random() 메소드는 0.0 <= ~ < 1.0 사이의 double 타입의 난수를 리턴한다.
 *     ex) Math.random() * 45는 0.0 <= ~ < 45.0 이다.
 */
public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("6");
        }
    }
}
