package ch17.sec01.exam01;
/**
 * <Stream>
 *     Java 8 부터 컬렉션 및 배열의 요소를 반복 처리하기 위한 코드이다.
 *     Iterator 과 비슷하지만 다음과 같은 차이점이 있다.
 *     1) 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적이다.
 *     2) 람다식으로 다양한 요소 처리를 정의할 수 있다.
 *     3) 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다.
 */

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("김자바");

        // Stream을 이용한 요소 반복 처리
        Stream<String> stream = set.stream(); // 스트림 얻기
        stream.forEach(name -> System.out.println(name)); // 람다식: 요소 처리 방법

    }
}
