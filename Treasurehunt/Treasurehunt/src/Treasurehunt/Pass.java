package Treasurehunt;

import java.awt.*;
import javax.swing.*;

import Treasurehunt.Start.clickListener;

import java.awt.event.*;

// ���� ���� 1�ܰ�
public class Pass extends JFrame {
	Container c = getContentPane();
	JLabel bg = new JLabel(); 
	
	Pass(){
		c.setLayout(null);
		
		// ���� �ܰ� �̵� ��ư ����
		ImageIcon bimg = new ImageIcon("img\\passbtn.png");
		Image bimg1 = bimg.getImage();
		Image bimg2 = bimg1.getScaledInstance(250, 50, Image.SCALE_SMOOTH);
		ImageIcon bimg3 = new ImageIcon(bimg2);
		
		JButton btn = new JButton(bimg3);
		btn.setBounds(200, 180, 230, 50);
		c.add(btn);
		btn.addMouseListener(new clickListener()); // �̺�Ʈ ������ ����
		
		// ó��ȭ�� �̵� ��ư ����
		ImageIcon bimg4 = new ImageIcon("img\\first1.png");
		Image bimg5 = bimg4.getImage();
		Image bimg6 = bimg5.getScaledInstance(250, 50, Image.SCALE_SMOOTH);
		ImageIcon bimg7 = new ImageIcon(bimg6);
		
		JButton btn2 = new JButton(bimg7);		
		btn2.setBounds(200, 250, 230, 50);
		c.add(btn2);
		btn2.addMouseListener(new clickListener2()); // �̺�Ʈ ������ ����
		
		// 1�ܰ� �н� ��� �̹��� ����
		ImageIcon ba = new ImageIcon("img\\pass1.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(585, 370, Image.SCALE_SMOOTH);
		ImageIcon backg = new ImageIcon(back);
		bg = new JLabel(backg);
		bg.setBounds(-8, -5, 600, 370);
		c.add(bg);
		
		// â ����
		setSize(600, 400);           // â ũ��
 		setVisible(true);            // ȭ�鿡 ������
 		setTitle("����ã��");           // Ÿ��Ʋ�� ���� 
		setLocationRelativeTo(null); // â ��� ��ġ
		setResizable(false);         // â ũ�� ����

		// ����� ���� �� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// ���� �ܰ� �̵� �̺�Ʈ ������
	public class clickListener implements MouseListener
    {

        public void mouseClicked(MouseEvent e)
        {
        	new Level2();
			setVisible(false);
		}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
	}
	
	// ó��ȭ�� �̵� �̺�Ʈ ������
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