package ch02.sec09;

/**
 * <+ 연산자 기능>
 * 피연산자가 모두 숫자일 경우엔 덧셈 연산
 * 피연산자 중 하나가 문자열일 경우엔 나머지 피연산자도 문자열로 변환되어 결합 연산
 */

public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        // 결합 연산
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);
    }
}
