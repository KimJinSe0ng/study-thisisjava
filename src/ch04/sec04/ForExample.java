package ch04.sec04;

/**
 * 초기화식, 증감식에 2개의 변수를 넣을 수 있다. (,)로 구분해서 작성한다.
 */
public class ForExample {
    public static void main(String[] args) {
        for (int i = 0, j = 20; i <= 10 && j >= 10; i++, j--) {
            System.out.println("i: " + i + " j: " + j);
        }
    }
}
