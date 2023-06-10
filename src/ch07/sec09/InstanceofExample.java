package ch07.sec09;

/**
 * <객체 타입 확인: instanceof>
 *     변수가 참조하는 객체의 타입을 확인하고자 할 때 쓴다.
 *     객체 instanceof 타입;
 *     좌항의 객체가 우항의 타입이면 true, 아니면 false
 */
public class InstanceofExample {
    // main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        // person 이 참조하는 객체가 Student 타입인지 확인
        // 매개값이 Student 인 경우에만 강제 타입 변환해서 studentNo 필드와 study() 메소드 사용
        /*
        if (person instanceof Student) {
            // Student 객체일 경우 강제 타입 변환
            Student student = (Student) person;
            // Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo: " + student.studentNo);
            student.study();
         */

        // person 이 참조하는 객체가 Student 타입일 경우
        // student 변수에 대입(타입 변환 발생)
        // Java 12 부터 사용 가능 -> instanceof 연산의 결과가 true 일 경우, 우측 타입 변수를 사용
        if (person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        // Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        // Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
