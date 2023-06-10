package ch05.sec05;

/**
 * replace() 메소드
 * 문자열에서 특정 문자열을 다른 문자열로 대체하고 싶다면 사용한다.
 * 기존 문자열은 그대로 두고, 새로운 문자열을 리턴한다.
 */
public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
