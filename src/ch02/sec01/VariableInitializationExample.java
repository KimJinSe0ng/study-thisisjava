package ch02.sec01;

/**
 * byte(1byte): -128 ~ 127
 * short(2byte): -32,768 ~ 32,767
 * char(2byte): 0 ~ 65535
 * int(4byte): -2^31 ~ (2^31 - 1) -> 2억(2 * 10^8)
 * long(8byte): -2^63 ~ (2^63 - 1)
 * e: e는 10의 거듭제곱 -> ex) e2 = 10^2 = 100 , e-2 = 10^(-2) = 0.01
 * 컴파일러는 정수형은 int, 실수형은 double 을 기본적으로 해석함
 */
public class VariableInitializationExample {
    public static void main(String[] args) {
        // 정수 타입
        //long var1 = 1000000000000; // 컴파일러는 int 로 간주하기 때문에 에러 발생
        long var2 = 1000000000000L;

        // 실수 타입
        //float var3 = 3.14; // 컴파일러는 double 로 간주하기 때문에 에러 발생
        float var4 = 3.14F;

        // 문자 타입
        //char c1 = ''; // 컴파일 에러
        char c2 = ' '; // 문자를 초기화할 땐 공백 하나를 포함해야 함

        // 문자열 타입
        // (')로 감싼 1개의 문자는 char 타입, (")로 감싼 문자들은 String 타입
        // 문자열을 문자 타입에 저장하면 컴파일 에러가 뜬다.
        //char c3 = "A"; // 컴파일 에러
        String str1 = "문자열";

        String str2 = """
                {
                    Java 13 부터는 이러한 텍스트 블록 문법을 제공한다.
                    작성된 문자열 그대로를 저장한다.
                }
                """;
        System.out.println(str2);
    }
}
