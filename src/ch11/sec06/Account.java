package ch11.sec06;
/**
 * <사용자 정의 예외>
 *     은행의 뱅킹 프로그램에서 잔고보다 더 많은 출금 요청이 들어오면 예외를 발생시켜야 하는데, 표준 라이브러리에 존재하지 않기 때문에
 *     직접 예외 클래스를 정의해서 사용해야 한다. 이를 사용자 정의 예외라고 한다.
 *     사용자 정의 예외는 컴파일러가 체크하는 일반 예외 or 컴파일러가 체크하지 않는 실행 예외로 선언할 수 있다.
 *     통상적으로 일반 예외는 Exception 의 자식 클래스로, 실행 예외는 RuntimeException 의 자식 클래스로 선언한다.
 *     + 사용자 정의 예외 클래스에는 기본 생성자와 예외 메시지를 입력받는 생성자를 선언해준다.
 *     why? 예외 객체의 공통 메소드인 getMessage() 의 리턴값으로 사용하기 위해서이다.
 *     <예외 발생 시키기>
 *         사용자 정의 예외를 직접 코드에서 발생시키려면 throw 키워드와 함께 예외 객체를 제공하면 된다.
 *         예외의 원인에 해당하는 메시지를 제공하고 싶다면 생성자 매개값으로 전달한다.
 *         ex) throw new Exception("예외메시지")
 *             throw new RuntimeException("예외메시지")
 *         + throw 된 예외는 직접 try-catch 블록으로 예외를 처리할 수도 있지만 대부분은 메소드를 호출한 곳에서 예외를 처리하도록 떠넘긴다.
 */
public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    // 출금(withdraw) 메소드에서 잔고(balance) 필드와 출금앨(매개값)을 비교해 잔고가 부족하면 InsufficientException 을 발생시키고 throws 한다.
    public void withdraw(int money) throws InsufficientException { // 호출한 곳으로 예외 떠넘김
        if (balance < money) {
            throw new InsufficientException("잔고 부족: " + (money - balance) + " 모자람"); // 예외 발생
        }
        balance -= money;
    }
}
