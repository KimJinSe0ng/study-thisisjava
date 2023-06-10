package ch05.sec12;

/**
 * 관례적으로 열거 상수는 대문자로 작성한다.
 * 여러 단어로 구성될 경우에는 단어와 단어 사이를 언더바(_)로 연결하는 것이 관례이다.
 * ex) LOGIN_SUCCESS, LOGIN_FAILED
 * 열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야한다. 열거 타입 Week로 변수를 선언하면 다음과 같다.
 * ex) Week today;
 * 열거 타입 변수에는 열거 상수를 대입할 수 있다. Week 변수에 열거 상수인 SUNDAY를 대입하는 코드는 다음과 같다.
 * ex) Week today = Week.SUNDAY;
 * 열거 타입은 참조 타입이므로 null 도 대입할 수 있다.
 * Week birthday = null;
 */
public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
