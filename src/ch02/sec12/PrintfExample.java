package ch02.sec12;

/**
 * <출력 함수>
 *     println(내용);  :  괄호 안의 내용을 출력하고 행을 바꿔라.
 *     print(내용);    :  괄호 안의 내용을 출력하고 행은 바꾸지 마라.
 *     printf("형식문자열", 값1, 값2 ...)  :  형식 문자열에 맞추어 뒤의 값을 출력해라.
 *     %는 형식 문자열의 시작을 의미한다.
 *     System.out.printf("이름: %1$s, 나이: %2#d", "홍길동", 25); // 1$는 첫 번째 값, 2$는 두 번째 값
 *     -가 오면 오른쪽이 공백으로 채워짐, -가 생략되면 왼쪽이 공백으로 채워짐, 0은 공백 대신 0으로 채움
 */
public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: %6d원\n", value);
        System.out.printf("상품의 가격: %-6d원\n", value);
        System.out.printf("상품의 가격: %06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %1$d 인 원의 넓이: %2$10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
