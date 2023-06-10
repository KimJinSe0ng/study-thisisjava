package ch05.sec05;

/**
 * charAt() : 매개값으로 주어진 인덱스의 문자를 리턴한다.
 */
public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "95062412301234";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
        }
    }
}
