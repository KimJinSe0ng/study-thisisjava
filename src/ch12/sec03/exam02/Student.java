package ch12.sec03.exam02;

/**
 * <객체 해시코드>
 *     두 객체가 동등함을 비교할 때 hashCode() 와 equals() 메소드를 같이 사용한다.
 *     우선 hashCode() 가 리턴하는 정수값이 같은지 확인 -> equals() 메소드가 true 를 리턴하는지 확인
 *
 */
public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() { // Object 의 hashCode() 메소드를 재정의해서 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 함
        // 번호와 이름이 같으면 동일한 해시코드가 생성됨
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) { // Object 의 equals() 메소드를 재정의해서 String 객체 인지 확인하고,
        // 학생 번호와 이름 해시코드가 같으면 true 를 리턴하도록 함
        if (obj instanceof Student target) {
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}
