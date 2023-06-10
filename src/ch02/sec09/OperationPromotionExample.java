package ch02.sec09;

/**
 * <산술 연산 특징>
 *     피연산자가 정수 타입(byte, short, char, int)이면 연산의 결과는 int 타입이다.
 *     피연산자가 정수 타입이고 그 중 하나가 long 타입이면 연산의 결과는 long 타입이다.
 *     피연산자 중 하나가 실수 타입이면 연산의 결과는 실수 타입이다.
 * <강제 형 변환>
 *     작은 타입은 큰 타입으로 자동으로 형 변환이 된다.
 *     큰 타입에서 작은 타입으로 형 변환할 경우에는 (작은 타입) variable 이런식으로 직접 해줘야 한다.
 */
public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20; // 컴파일 단계에서 연산
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; // int 타입으로 변환 후 연산
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 =  1000L;
        long result3 = v3 + v4 + v5; // long 타입으로 변환 후 연산
        System.out.println("result3: " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7; // int 타입으로 변환 후 연산
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);

        int v8 = 10;
        int result5 = v8 / 4; // 정수 연산의 결과는 정수
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0; // double 타입으로 변환 후 연산
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double)v10 / v11; // double 타입으로 변환 후 연산
        System.out.println("result7: " + result7);
    }
}
