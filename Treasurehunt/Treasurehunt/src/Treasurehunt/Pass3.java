package Treasurehunt;

import java.awt.*;
import javax.swing.*;

import Treasurehunt.Start.clickListener;

import java.awt.event.*;

// 게임 성공 3단계
public class Pass3 extends JFrame {
	Container c = getContentPane();
	JLabel bg = new JLabel(); 
	
	Pass3(){
		c.setLayout(null); 
		
		// 처음으로 이동 버튼 생성
		ImageIcon bimg = new ImageIcon("img\\first1.png");
		Image bimg1 = bimg.getImage();
		Image bimg2 = bimg1.getScaledInstance(250, 50, Image.SCALE_SMOOTH);
		ImageIcon bimg3 = new ImageIcon(bimg2);
		
		JButton btn = new JButton(bimg3);
		btn.setBounds(180, 210, 250, 50);			
		c.add(btn);
		btn.addMouseListener(new clickListener()); // 이벤트 리스너 부착
		
		// 패스 3단계 배경 이미지 생성
		ImageIcon ba = new ImageIcon("img\\pass3.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(585, 370, Image.SCALE_SMOOTH);
		ImageIcon backg = new ImageIcon(back);
		bg = new JLabel(backg);
		bg.setBounds(-8, -5, 600, 370);
		c.add(bg);
		
		// 창 설정
		setSize(600, 400);           // 창 사이즈
		setVisible(true);            // 화면 보여줌
		setTitle("보물찾기");           // 타이틀명 변경 
		setLocationRelativeTo(null); // 창 가운데 배치
		setResizable(false);         // 창 크기 고정

		// 종료시 완전 히 끔
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 처음화면 이동 이벤트 리스너
	public class clickListener implements MouseListener
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
