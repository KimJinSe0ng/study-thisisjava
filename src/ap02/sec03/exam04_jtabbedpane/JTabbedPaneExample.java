package ap02.sec03.exam04_jtabbedpane;

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneExample extends JFrame {
    private JTabbedPane jTabbedPane;
    private JPanel tab1Panel;
    private JPanel tab2Panel;

    // 메인 윈도우 설정
    public JTabbedPaneExample() {
        this.setTitle("JTabbedPaneExample");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(getJTabbedPane(), BorderLayout.CENTER);
    }

    // JTabbedPane 생성 및 Tab 추가
    private JTabbedPane getJTabbedPane() {
        if (jTabbedPane == null) {
            jTabbedPane = new JTabbedPane(); // JTabbedPane을 생성하려면 기본 생성자를 호출한다.
            jTabbedPane.setTabPlacement(JTabbedPane.LEFT); // 탭의 위치를 설정한다.
            jTabbedPane.addTab("탭1", getTab1Panel()); // JTabbedPane에 탭을 추가하려면 addTab() 메소드 이용
            jTabbedPane.addTab("탭2", getTab2Panel());
            // addTab() 메소드는 탭의 이름과 탭안에 배치될 컴포넌트를 매개값으로 받는데, 컴포넌트는 주로 JPanel을 객체를 사용한다.
        }
        return jTabbedPane;
    }

    // Tab1에 추가된 Jpanel 생성
    private JPanel getTab1Panel() {
        if (tab1Panel == null) {
            tab1Panel = new JPanel();
            JLabel jLabel = new JLabel();
            jLabel.setIcon(new ImageIcon(getClass().getResource("art1.jpeg")));
            tab1Panel.add(jLabel);
        }
        return tab1Panel;
    }

    // Tab2에 추가된 Jpanel 생성
    private JPanel getTab2Panel() {
        if (tab2Panel == null) {
            tab2Panel = new JPanel();
            JLabel jLabel = new JLabel();
            jLabel.setIcon(new ImageIcon(getClass().getResource("art2.jpg")));
            tab2Panel.add(jLabel);
        }
        return tab2Panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JTabbedPaneExample jFrame = new JTabbedPaneExample();
                jFrame.setVisible(true);
            }
        });
    }
}
