package ch17.sec10;
/**
 * <요소 기본 집계>
 *     Optional 클래스 : 단순히 집계값만 저장하는 것이 아니라, 집계값이 존재하지 않을 경우 디폴트 값을 설정하거나 집계값을 처리하는 Consumer 를 등록할 수 있다.
 *     컬렉션에 요소가 존재하지 않아 집계 값을 산출할 수 없는 경우 NoSuchElementException 예외가 발생한다.
 *     예를 들어 평균을 구하는 average 를 최종 처리에서 사용할 경우, 요소(집계값)가 없는 경우를 대비할 수 있다.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /* // 예외 발생(요소가 없음)
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
         */

        // 방법1: isPresent() 메소드가 true 를 리턴할 때만 집계값을 얻는다.
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("방법1 평균: " + optional.getAsDouble());
        } else {
            System.out.println("방법1 평균: 0.0");
        }

        // 방법2: orElse() 메소드로 집계값이 없을 경우를 대비해서 디폴트 값을 제공한다.
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2 평균: " + avg);

        // 방법3: ifPresent() 메소드로 집계값이 있을 경우에만 동작하는 Consumer 람다식을 제공한다.
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a-> System.out.println("방법3 평균: " + a));
    }
}
