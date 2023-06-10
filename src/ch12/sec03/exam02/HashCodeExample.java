package ch12.sec03.exam02;
/**
 * <객체 해시코드>
 *     두 객체가 동등함을 비교할 때 hashCode() 와 equals() 메소드를 같이 사용한다.
 *     우선 hashCode() 가 리턴하는 정수값이 같은지 확인 -> equals() 메소드가 true 를 리턴하는지 확인
 *
 */
public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        } else {
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }
    }
}
