package Treasurehunt;

import javax.swing.*;

import Treasurehunt.Start.clickListener2;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// ���Ӽ���
public class Explanation extends JFrame {
	Container c = getContentPane();
	JButton bt2 = new JButton();
	
	Explanation(){
		c.setLayout(null);
		
		// â �ݱ� ��ư ����
		ImageIcon bimg = new ImageIcon("img\\X.png");
		Image bimg1 = bimg.getImage();
		Image bimg2 = bimg1.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		ImageIcon bimg3 = new ImageIcon(bimg2);
		
		bt2 = new JButton(bimg3);
		bt2.setBounds(515, 15, 40, 40);
		c.add(bt2);
		bt2.addMouseListener(new clickListener2()); // �̺�Ʈ ������ ����
		
		// ���� ���� �̹��� ����
		ImageIcon ba = new ImageIcon("img\\Explanation.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(585, 470, Image.SCALE_SMOOTH);
		ImageIcon backg = new ImageIcon(back);

		JLabel bg = new JLabel(backg);
		bg.setBounds(-8, -5, 600, 470);
		c.add(bg);
		
		// â ����
		setSize(600, 500);            // â ũ�� 
		setVisible(true);             // ȭ�鿡 ������
		setLocationRelativeTo(null);  // â ��� ��ġ
		setResizable(false);          // â ũ�� ����	
	}
	
	// â �ݱ� �̺�Ʈ ������ ����
	public class clickListener2 implements MouseListener
    {

        public void mouseClicked(MouseEvent e)
        {
			setVisible(false);
		}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
	}
	
}