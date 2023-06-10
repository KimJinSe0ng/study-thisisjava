package ch15.sec03.exam03;
/**
 * for(String element : set) {
 *     if(element.equals("JSP") {
 *         set.remove(element);
 *         // 오류 발생 -> 왜? for 는 이미 몇 번 반복할지 정하고 반복하기 때문에 제거를 해버리면 4번 돌아야하는데 3번 돌아야 해서 오류 add 도 안됨
 *     }
 * }
 */

import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        // 객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // 방법1. 객체를 하나씩 가져와서 처리 (Set 컬렉션의 iterator() 메소드로 반복자를 얻어 객체를 하나씩 가져오는 것이다.)
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            // 객체를 하나 가져오기
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                // 가져온 객체를 컬렉션에서 제거
                // iterator 는 set 의 객체를 참조만 해서 가져올뿐이라 iterator 자체가 객체를 갖고 있는게 아니다.
                // remove 를 하면 set 에서 제거됨
                iterator.remove();
            }
        }
        System.out.println();

        // 객체 제거
        set.remove("JDBC");

        // 방법2. 객체를 하나씩 가져와서 처리
        for (String element : set) { // 이 자리에 set 이 들어간건 iterable 을 상속, 구현 한 거는 이 자리에 올 수 있음
            System.out.println(element);
        }
    }
}
