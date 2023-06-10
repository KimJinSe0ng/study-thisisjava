package ch15.sec05.exam04;
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
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // 비교자를 제공한 TreeSet 컬렉션 생성
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

        // 객체 저장
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        // 객체를 하나씩 가져오기
        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
