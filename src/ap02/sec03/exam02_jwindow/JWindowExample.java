package ap02.sec03.exam02_jwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JWindowExample extends JWindow {
    public JWindowExample() {
        // Window의 크기, 반드시 폭과 높이가 있어야 한다.
        this.setSize(600, 350);

        // JWindow를 화면 중앙으로 띄우기 위해 필요한 코드
        // java.awt.GraphicsEnvironment 는 그래픽 환경에 대한 정보를 가지고 있는 객체로, 정적 메소드인 getLocalGraphicsEnvironment() 를 호출해서 얻을 수 있다.
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint(); // 화면 중앙 지점의 X, Y 좌표를 갖고 있는 Point 객체를 리턴한다.
        // 화면 중앙 좌표와 윈도우 폭, 높이로 JWindow의 좌측 상단 모서리 좌표 계산
        int leftTopX = centerPoint.x - this.getWidth() / 2;
        int leftTopY = centerPoint.y - this.getHeight() / 2;
        this.setLocation(leftTopX, leftTopY); // 좌측 상단 모서리 좌표 설정

        // JWindow에 이미지가 포함된 JLabel 추가
        // setIcon() 메소드로 ImageIcon 객체를 매개값으로 주면 이미지를 나타낼 수 있다.
        // ImageIcon 생성자는 이미지 파일의 URL 객체를 매개값으로 받는데, JWindowExample.class와 동일한 폴더에 있는
        // 'art.jpeg'파일에 대한 URL 객체를 얻기 위해 다음과 같이 쓴다. getClass().getResource("art.jpeg")
        JLabel label = new JLabel(); // 글자 및 이미지를 포함할 수 있는 컴포넌트
        label.setIcon(new ImageIcon(getClass().getResource("art.jpeg")));
        getContentPane().add(label, BorderLayout.CENTER); // JLabel을 JWindow의 중앙에 배치시킨다.

        // 마우스 클릭 이벤트 처리
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose(); // 화면에서 완전히 제거하고 싶으면 호출
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JWindowExample jWindow = new JWindowExample(); // 화면에 띄우기
                jWindow.setVisible(true); // false 이면, JWindow가 화면에서 숨겨진다.
            }
        });
    }
}
