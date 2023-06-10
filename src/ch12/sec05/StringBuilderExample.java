package ch12.sec05;

/**
 * <StringBuilder 클래스>
 *     String 은 내부 문자열을 수정할 수 없다.
 *     문자열 결합은 새로운 객체가 생성되고 이전 객체는 계속 버려지는 것이기 때문에 효율성이 좋지는 않다.
 *     잦은 문자열 변경 작업을 해야 한다면 StringBuilder 를 사용하는 것이 좋다.
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF") // 문자열을 끝에 추가
                .insert(0, "ABC") // 문자열을 지정 위치에 추가
                .delete(3, 4) // 문자열 일부를 삭제
                .toString(); // 완성된 문자열을 리턴
        System.out.println(data);
    }
}
