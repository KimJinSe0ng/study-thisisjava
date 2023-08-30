package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        //OK 버튼 객체 생성
        Button btnOk = new Button();

        //OK 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnOk.setClickListener(() -> {
            System.out.println("OK 버튼 클릭");
        });

        //OK 버튼 클릭하기
        btnOk.click();

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼 클릭");
        });

        //Cancel 버튼 클릭
        btnCancel.click();
    }
}
