package Treasurehunt;

import java.awt.*;
import javax.swing.*;

import Treasurehunt.Start.clickListener;

import java.awt.event.*;

//게임 성공 2단계
public class Pass2 extends JFrame {
	Container c = getContentPane();
	JLabel bg = new JLabel(); 

	Pass2(){
		c.setLayout(null);
		
		// 다음 단계 이동 버튼 생성
		ImageIcon bimg = new ImageIcon("img\\passbtn.png");
		Image bimg1 = bimg.getImage();
		Image bimg2 = bimg1.getScaledInstance(250, 50, Image.SCALE_SMOOTH);
		ImageIcon bimg3 = new ImageIcon(bimg2);
		
		JButton btn = new JButton(bimg3);
		btn.setBounds(200, 170, 230, 50);
		c.add(btn);
		btn.addMouseListener(new clickListener());
		
		// 처음화면 이동 버튼 생성
		ImageIcon bimg4 = new ImageIcon("img\\first1.png");
		Image bimg5 = bimg4.getImage();
		Image bimg6 = bimg5.getScaledInstance(250, 50, Image.SCALE_SMOOTH);
		ImageIcon bimg7 = new ImageIcon(bimg6);
		
		JButton btn2 = new JButton(bimg7);
		btn2.setBounds(200, 240, 230, 50);
		c.add(btn2);
		btn2.addMouseListener(new clickListener2());
		
		// 패스 2단계 배경 이미지 생성
		ImageIcon ba = new ImageIcon("img\\pass2.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(585, 370, Image.SCALE_SMOOTH);
		ImageIcon backg = new ImageIcon(back);
		
		bg = new JLabel(backg);
		bg.setBounds(-8, -5, 600, 370);
		c.add(bg);
		
		// 창 설정
		setSize(600, 400);
		setVisible(true);
		setTitle("보물찾기");
		setLocationRelativeTo(null);
		setResizable(false);

		// 종료시 완전 히 끔
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 다음 단계 이동 이벤트 리스너
	public class clickListener implements MouseListener
    {

        public void mouseClicked(MouseEvent e)
        {
        	new Level3();
			setVisible(false);
		}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
	}
	
	// 처음화면 이동 이벤트 리스너
	public class clickListener2 implements MouseListener
    {

        public void mouseClicked(MouseEvent e)
        {
        	new Start();
			setVisible(false);
		}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
	}
}
