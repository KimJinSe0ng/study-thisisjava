package ch06.sec10.exam02;

/**
 * <정적 블록>
 *     정적 필드는 필드 선언과 동시에 초기값을 주는 것이 일반적이다.
 *     복잡한 초기화 작업이 필요하다면 정적 블록을 이용해야 한다.
 */
public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static { // info는 정적 블록에서 company와 model을 서로 연결하여 초기값으로 주었다.
        info = company + "-" + model;
    }
}
