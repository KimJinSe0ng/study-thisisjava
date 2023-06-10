package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("람다식");
        list.add("박병렬");

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream(); // 병렬 스트림 얻기
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName()); // 람다식: 요소 처리 방법
            // 처리되는 요소가 무엇이고, 어떤 스레드가 처리하는지를 출력한다.
        });
    }
}
