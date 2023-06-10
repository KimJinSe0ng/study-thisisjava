package ch05.sec06;
/**
 *  <배열 변수 선언>
 *      타입[] 변수;        타입 변수[];
 *      관례적으로 타입[] 변수; 방식을 사용한다.
 *  <값 목록으로 배열 생성>
 *      타입[] 변수 = {값0, 값1, 값2, ...};
 *  <주의사항>
 *      타입[] 변수;
 *      변수 = {값0, 값1, 값2, ...}; // 컴파일 에러
 *      배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다.
 *      배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면 new 타입[]을 {} 앞에 붙여주면 된다.
 *      예를 들어,
 *      String[] names = null;
 *      names = new String[] {"신용권", "홍길동", "김자바"};
 *      추가로, 메소드의 매개변수가 배열 타입일 경우에도 마찬가지다.
 *      // 메소드 선언
 *      void printItem(int[] scores) { ... }
 *      // 잘못된 메소드 호출
 *      printItem({95, 85, 90});
 *      // 올바른 메소드 호출
 *      printItem(new int[] {95, 80, 90});
 *  </주의사항>
 */
public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] scores;
        // 배열 변수에 배열을 대입
        scores = new int[]{83, 90, 87};
        // 배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);

        // 배열을 매개값으로 주고, printItem() 메소드 호출
        printItem(new int[]{83, 90, 87});
    }

    // printItem() 메소드 선언
    public static void printItem(int[] scores) {
        // 매개변수가 참조하는 배열의 항목을 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]:" + scores[i]);
        }
    }
}
