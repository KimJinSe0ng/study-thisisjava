package ch12.sec03.exam03;

/**
 * <toString()>
 *     객체의 문자 정보를 리턴한다.
 *     객체의 문자 정보란 객체를 문자열로 표현한 값이다.
 *     기본적으로 '클래스명@16진수해시코드'로 구성된 문자열을 리턴한다.
 *     객체의 문자 정보가 중요한 경우에는 메소드를 재정의해서 리턴해야 한다.
 *     ex) Date 클래스는 현재 날짜와 시간을, String 클래스는 저장된 문자열을 리턴한다.
 * </toString()>
 */
public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + ", " + os; // 제조사와 운영체제가 결합된 문자열을 리턴함
    }
}
