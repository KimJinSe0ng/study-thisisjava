package ch06.sec12.hyundai;
/**
 * <패키지>
 *     패키지는 클래스의 일부분이며 클래스를 식별하는 용도로 사용된다.
 *     주로 개발 회사의 도메인 이름의 역순으로 만든다. ex) com.samsung.프로젝트이름
 *     상위 패키지와 하위 패키지를 도트(.)로 구분한다. 물리적으로 하위 디렉토리임을 뜻한다.
 * <import 문>
 *     같은 패키지에 있는 클래스는 아무런 조건 없이 사용할 수 있지만,
 *     다른 패키지에 있는 클래스를 사용하려면 import 문을 이용해서 어떤 패키지의 클래스를 사용해야 하는지 명시해야 한다.
 *     만약 동일한 패키지에 포함된 다수의 클래스를 사용해야 한다면 클래스 이름을 생략하고 *를 사용할 수 있다.
 *     만약 서로 다른 패키지에 동일한 클래스 이름이 존재한다면, 디렉토리를 전부 입력해줘야 한다.
 */
// import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
    // 부품 필드 선언
    ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
