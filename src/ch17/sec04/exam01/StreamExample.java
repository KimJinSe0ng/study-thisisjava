package ch17.sec04.exam01;
/**
 *  컬렉션으로부터 스트림 얻기
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Product product = new Product(i, "상품" + i, "멋진 회사", (int) (10000 * Math.random()));
            list.add(product);
        }

        // 객체 스트림 얻기
        Stream<Product> stream = list.stream();
        stream.forEach(p -> System.out.println(p)); // 객체를 주면 자동으로 toString() 이 출력된다.
    }
}
