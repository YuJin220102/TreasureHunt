package Treasurehunt;

import javax.swing.*;

import Treasurehunt.Pass.clickListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 게임 실패시 창
public class Failed extends JFrame{
	Container c = getContentPane();
	JLabel bg = new JLabel(); 
	
	Failed(){
		c.setLayout(null);
		
		// 처음화면 이동 버튼 생성
		ImageIcon bimg = new ImageIcon("img\\first1.png");
		Image bimg1 = bimg.getImage();
		Image bimg2 = bimg1.getScaledInstance(280, 60, Image.SCALE_SMOOTH);
		ImageIcon bimg3 = new ImageIcon(bimg2);
		
		JButton btn = new JButton(bimg3);
		btn.setBounds(160, 180, 280, 60);		
		c.add(btn);
		btn.addMouseListener(new clickListener()); // 이벤트 리스터 부착
		
		// 실패 배경 이미지
		ImageIcon ba = new ImageIcon("img\\Failed.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(585, 370, Image.SCALE_SMOOTH);
		ImageIcon backg = new ImageIcon(back);
		
		bg = new JLabel(backg);
		bg.setBounds(-8, -5, 600, 370);
		c.add(bg);
		
		// 창 설정
		setSize(600, 400);           // 창 크기 설정
		setVisible(true);            // 화면 보여줌
		setTitle("보물찾기");           // 타이틀 설정
		setLocationRelativeTo(null); // 창 가운데 배치
		setResizable(false);         // 창 크기 고정
		
		// 종료시 완전 히 끔
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 처음화면 이동 이벤트 리스너 부착
	public class clickListener implements MouseListener{
		public void mouseClicked(MouseEvent e){
			new Start();
			setVisible(false);
			}
	        public void mousePressed(MouseEvent e) {}
	        public void mouseReleased(MouseEvent e) {}
	        public void mouseEntered(MouseEvent e) {}
	        public void mouseExited(MouseEvent e) {}
		}
}
