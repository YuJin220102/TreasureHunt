package Treasurehunt;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

// ���� ���� ȭ��
public class Start extends JFrame {
	Container c = getContentPane(); // ����Ʈ�� ����
	JButton bt = new JButton();     // ���� �̵� ��ư ����
	JButton bt2 = new JButton();    // ���� ���� ��ư ����
	
	Start() {
		
		c.setLayout(null); // ��ġ ������ ����

		// �̹��� ũ�� ���� ���� : https://eating-coding.tistory.com/5
		// ���� �̵� (�̹��� ũ�� ���� �� ��ư�� â��)
		ImageIcon bimg = new ImageIcon("img\\startbtn.png");
		Image bimg1 = bimg.getImage();
		Image bimg2 = bimg1.getScaledInstance(400, 70, Image.SCALE_SMOOTH);
		ImageIcon bimg3 = new ImageIcon(bimg2);

		bt = new JButton(bimg3);
		bt.setBounds(400, 430, 400, 70);
		c.add(bt);
		bt.addMouseListener(new clickListener()); // �̺�Ʈ ������ ����

		// ���� ���� (�̹��� ũ�� ���� �� ��ư�� â��)
		ImageIcon bimg2_1 = new ImageIcon("img\\Explanationbtn.png");
		Image bimg2_2 = bimg2_1.getImage();
		Image bimg2_3 = bimg2_2.getScaledInstance(400, 70, Image.SCALE_SMOOTH);
		ImageIcon bimg2_4 = new ImageIcon(bimg2_3);

		bt2 = new JButton(bimg2_4);
		bt2.setBounds(400, 550, 400, 70);
		c.add(bt2);
		bt2.addMouseListener(new clickListener2()); // �̺�Ʈ ������ ����

		// ���
		JLabel bg = new JLabel();

		ImageIcon ba = new ImageIcon("img\\start.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(1200, 770, Image.SCALE_SMOOTH);
		ImageIcon backg = new ImageIcon(back);
		bg = new JLabel(backg);
		bg.setBounds(0, -5, 1200, 770);
		c.add(bg);

		// â ����
		setSize(1200, 800);          // â ũ��
		setVisible(true);            // ȭ�鿡 ����
		setTitle("����ã��");           // Ÿ��Ʋ��
		setLocationRelativeTo(null); // â ��� ��ġ
		setResizable(false);         // â ũ�� ����

		// ����� ���� �� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// ���� �̵� �̺�Ʈ ������
	public class clickListener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			new Level2();
			setVisible(false);
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	// ���� ���� �̺�Ʈ ������
	public class clickListener2 implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			new Explanation();
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	// ���� �Լ�
	public static void main(String args[]) {
		new Start();
		Music.audio();
	}
}