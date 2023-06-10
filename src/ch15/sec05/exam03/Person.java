package ch15.sec05.exam03;
/**
 * <Comparable>
 *     TreeSet 에 저장되는 객체와 TreeMap 에 저장되는 키 객체는 저장과 동시에 오름차순으로 정렬되는데,
 *     해당 객체가 Comparable 인터페이스를 구현하고 있어야 가능하다.
 *     사용자 정의 객체를 저장할 때에는 반드시 Comparable 을 구현하고 있어야 한다.
 *     Comparable 인터페이스에는 compareTo() 메소드가 정의되어 있는데 이를 재정의해서 비교 결과를 정수로 리턴해야 한다.
 * <Comparator>
 *     비교 기능이 있는 Comparable 구현 객체를 key 로 저장하는게 원칙이지만, 비교 기능이 없는 Comparable 비구현 객체를 저장하는 방법이다.
 *     TreeSet 과 TreeMap 을 생성할 때 비교자(Comparator)를 제공하면 된다.
 */
public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1; // 아래를 -1로 위를 1로 바꾸면 내림차순 정렬로 바뀜
        else if (age == o.age) return 0;
        else return 1; // -1
    }
}
