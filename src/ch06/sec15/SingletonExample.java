package ch06.sec15;
/**
 * <싱글톤 패턴>
 *     애플리케이션 전체에서 단 한 개의 객체만 생성해서 사용하고 싶다면 싱글톤 패턴을 적용할 수 있다.
 *     핵심: 생성자를 private 접근 제한해서 외부에서 new 연산자로 생성자를 호출할 수 없도록 막는 것이다.
 *     생성자를 호출할 수 없으니 외부에서 마음대로 객체를 생성하는 것이 불가능해진다.
 *     대신 싱글톤 패턴이 제공하는 정적 메소드를 통해 간접적으로 객체를 얻을 수 있다.
 */
public class SingletonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton(); // 컴파일 에러
        Singleton obj2 = new Singleton(); // 컴파일 에러
         */

        // 정적 메소드를 호출해서 싱글톤 객체 얻음
        // 외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 것이다.
        // getInstance() 메소드가 리턴하는 객체는 정적 필드가 참조하는 싱글톤 객체이다.
        // 따라서 변수 1과 변수2가 참조하는 객체는 동일한 객체가 된다.
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // 동일한 객체를 참조하는지 확인
        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
