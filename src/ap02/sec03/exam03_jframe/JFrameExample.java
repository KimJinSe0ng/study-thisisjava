package ap02.sec03.exam03_jframe;

import javax.swing.*;
import java.awt.*;

public class JFrameExample extends JFrame {
    public JFrameExample() {
        // JWindow 크기
        this.setSize(600, 500);
        // 제목 표시줄 내용
        // JFrame의 제목 표시줄은 아이콘, 제목, 크기 조졸용 버튼, 종료 버튼으로 구성된다.
        // 아이콘은 setIconImage() 메소드로 설정, ImageIcon 객체의 getImage() 메소드로 Image 객체를 얻어 매개값으로 설정한다.
        this.setIconImage(new ImageIcon(getClass().getResource("art.jpeg")).getImage());
        this.setTitle("메인창"); // 창 제목 설정

        // 종료 버튼의 기본 기능 : setDefaultCloseOperation() 메소드로 변경하지 않고 종료 버튼 누를 시
        // 숨기기만 하고 프로세스를 종료하지 않는다.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 종료

        // JWindow를 화면 중앙으로 띄우기
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int leftTopX = centerPoint.x - this.getWidth() / 2;
        int leftTopY = centerPoint.y - this.getHeight() / 2;
        this.setLocation(leftTopX, leftTopY); // 좌측 상단 모서리 좌표 설정
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameExample jFrame = new JFrameExample();
                jFrame.setVisible(true);
            }
        });
    }
}
