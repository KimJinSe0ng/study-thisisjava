package ch16.sec01;

@FunctionalInterface // 함수형 인터페이스임을 보장해준다.
public interface Calculable {
    // 추상 메소드
    void calculate(int x, int y);
}
