package ch05.sec05;

/**
 * indexOf() : 문자열에서 특정 문자열의 위치를 찾고자 할 때 사용한다. 주어진 문자열이 시작되는 인덱스를 리턴한다.
 *             만약 주어진 문자열이 포함되어 있지 않으면 -1 을 리턴한다.
 * contains() : 주어진 문자열이 단순히 포함되어 있는지만 조사하고 싶다면 사용한다.
 *              포함되어 있으면 true, 포함되어 있지 않으면 false 를 리턴한다.
 */
public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) { // 포함되어 있지 않은 경우
            System.out.println("자바와 관련된 책이군요");
        } else { // 포함되어 있는 경우
            System.out.println("자바와 관련 없는 책이군요");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
