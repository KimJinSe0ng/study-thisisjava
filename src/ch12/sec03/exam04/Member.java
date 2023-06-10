package ch12.sec03.exam04;

/**
 * <레코드 선언>
 *     컴파일하면 변수의 타입과 이름을 이용해 private final 필드가 자동 생성되고,
 *     생성자 및 Getter 메소드가 자동으로 추가된다.
 *     hashCode(), equals(), toString() 메소드를 재정의한 코드도 자동으로 추가된다.
 *     </레코드>
 * @param id
 * @param name
 * @param age
 */
public record Member (String id, String name, int age){
}
