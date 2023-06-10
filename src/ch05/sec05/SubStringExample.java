package ch05.sec05;

/**
 * substring() 메소드
 * substirng(int beginIndex) : beginIndex에서 끝까지 잘라내기
 * substring(int beginIndex, int endIndex) : beginIndex에서 endIndext 앞까지 잘라내기
 */
public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
