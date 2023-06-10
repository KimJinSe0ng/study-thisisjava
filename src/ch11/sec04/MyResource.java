package ch11.sec04;
/**
 * <리소스 자동 닫기>
 *     리소스 : 데이터를 제공하는 객체
 *     리소스는 사용하기 위해 열어야하며, 사용이 끝난 다음에는 닫아야한다.
 *     try-with-resource 블록을 사용하면 예외 발생 여부와 상관없이 리소스를 자동으로 닫아준다. -> close() 메소드 호출
 *     try-with-resource 블록을 사용하기 위해서는 조건이 하나 있다.
 *     리소스는 java.lang.AutoCloseable 인터페이스를 구현해서 close() 메소드를 재정의 해야한다.
 *     복수 개의 리소스를 사용해야 한다면 try() 괄호 안에 세미콜론(;)으로 구분해서 리소스를 여는 코드를 작성하면 된다.
 *     + 복수 개의 리소스를 사용할 때 가장 최근에 사용한 리소스 부터 순서대로 close 를 한다.
 */
public class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("MyResource: " + name + " 열기");
    }

    public String read1() {
        System.out.println("MyResource: " + name + " 읽기");
        return "100";
    }

    public String read2() {
        System.out.println("MyResource: " + name + " 읽기");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResource: " + name + " 닫기");
    }
}
