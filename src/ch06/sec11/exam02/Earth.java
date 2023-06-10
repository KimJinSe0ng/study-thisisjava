package ch06.sec11.exam02;

/**
 * <final 상수 선언>
 *     원주율 파이나 지구의 무게 및 둘레 등 불변의 값을 저장하는 필드를 상수라고 한다.
 *     상수는 객체마다 저장할 필요가 없고, 여러 개의 값을 가져도 안되기 때문에 static 이면서 final 인 특성을 가져야 한다.
 *     상수 이름은 모두 대문자로 작성하는 것이 관례이다. 다른 언어끼리 혼합된 이름이라면 언더바(_)로 결합한다.
 *     클래스로 접근해서 읽을 수 있다.
 */
public class Earth {
    // 상수 선언 및 초기화
    static final double EARTH_RADIUS = 6400;

    // 상수 선언
    static final double EARTH_SURFACE_AREA;

    // 정적 블록에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
