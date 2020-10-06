package sist;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

// F1 키를 입력 받으면 배경색을 파란색으로 변경하고 
// ESC 키를 입력 받으면 배경색을 노란색으로 변경한다.

public class Ex28_Event {

	public static void main(String[] args) {

		JFrame jf = new JFrame("이벤트 예제-3");

		JPanel jp = new JPanel();

		// 1. 컴포넌트를 만들어 보자.
		JLabel label = new JLabel();

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(label);

		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);

		jp.setFocusable(true);

		jf.setBounds(200, 200, 500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		// 이벤트 처리
		jp.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {	}

			@Override
			public void keyReleased(KeyEvent e) {
				label.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력 되었습니다.");
				if (e.getKeyCode() == KeyEvent.VK_F1) {
					jp.setBackground(Color.BLUE);
				} else if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					jp.setBackground(Color.YELLOW);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {}
		});
	}
}
