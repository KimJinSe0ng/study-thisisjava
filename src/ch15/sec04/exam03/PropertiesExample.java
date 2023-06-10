package ch15.sec04.exam03;

import java.util.Properties;
public class PropertiesExample {
    public static void main(String[] args) throws Exception{
        // Properties 컬렉션 생성
        Properties properties = new Properties();

        // PropertiesExample.class 와 동일한 Classpath 에 있는 파일 로드
        properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

        // 주어진 키에 대한 값 일기
        String dirver = properties.getProperty("driver");

        // 값 출력
        System.out.println("driver : " + dirver);
    }
}
