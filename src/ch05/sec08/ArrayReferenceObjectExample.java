package ch05.sec08;

/**
 * 객체를 참조하는 배열
 * 리터럴 문자열이 같기 때문에 strArray[0] 과 [1] 항목은 동일한 번지에 저장된다.
 * 하지만 [2] 항목은 new 연산자로 생성된 String 객체가 대입되므로 다른 번지가 지정된다.
 */
public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]); // true: 같은 객체 참조
        System.out.println(strArray[1] == strArray[2]); // false: 다른 객체를 참조
        System.out.println(strArray[0].equals(strArray[2])); // true: 문자열이 동일
    }
}
