package ch15.sec03.exam01;
/**
 * <Set 컬렉션>
 *     저장 순서 유지 X
 *     객체 중복 저장 X
 *     수학의 집합과 같다.
 */

import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        // 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); // 중복 객체이므로 저장하지 않음
        set.add("Spring");

        // 저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}
