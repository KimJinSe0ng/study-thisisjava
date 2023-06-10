package ap02.sec02.exam01_invokeLater;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends JFrame {
    public App() {
        setTitle("Swing App");
        setSize(300, 100);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // 이벤트 큐에 Runnable 넣기
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 윈도우 생성
                App app = new App();
                // 윈도우를 보여줌
                app.setVisible(true);
                System.out.println(Thread.currentThread().getName());
            }
        });
    }
}
