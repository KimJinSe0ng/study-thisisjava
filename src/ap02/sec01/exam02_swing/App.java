package ap02.sec01.exam02_swing;
/**
 * Swing으로 작성한 윈도우 프로그램 예제
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// JFrame 상속
public class App extends JFrame {
    public App() {
        // 제목 설정
        setTitle("Swing App");
        // 윈도우 크기 설정
        setSize(300, 100);
        // JButton 추가
        getContentPane().add(new JButton("OK"), BorderLayout.SOUTH);
        // 윈도우 종료 버튼을 클릭하면 프로세스 종료
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // 윈도우 생성
        App app = new App();
        // 윈도우를 보여줌
        app.setVisible(true);
    }
}
