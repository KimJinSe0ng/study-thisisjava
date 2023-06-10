package ch17.sec06.exam02;
/**
 * 요소 변환(매핑)
 * 정수 스트림을 실수 스트림으로 변환하고, 기본 타입 스트림을 래퍼 스트림으로 변환하는 방법
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println(d));

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj));
    }
}
