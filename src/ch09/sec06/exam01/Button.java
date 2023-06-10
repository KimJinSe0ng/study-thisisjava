package ch09.sec06.exam01;

public class Button {
    // 정적 중첩 인터페이스
    public static interface ClickListener {
        // 추상 메소드
        void onClick(); // 버튼이 클릭되었을 때 호출될 메소드
    }
}
