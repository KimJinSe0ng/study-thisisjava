package ch06.sec07.exam02;

/**
 * <필드 초기화>
 *     객체마다 동일한 값을 갖고 있다면 필드 선언 시 초기값을 대입하는 것이 좋고,
 *     객체마다 다른 값을 가져야 한다면 생성자에서 필드를 초기화하는 것이 좋다.
 *     한국인이면 국적이 "대한민국"으로 동일하지만, 이름과 주민등록번호는 한국인마다 다르므로 생성자에서 초기화하는게 좋다.
 */
public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String name, String ssn) {
        // 필드임을 구분하기 위해 this 키워드를 사용함.
        // this는 현재 객체를 말하며,
        // this.name은 현재 객체의 데이터(필드)로서의 name을 뜻한다.
        this.name = name;
        this.ssn = ssn;
    }
}
