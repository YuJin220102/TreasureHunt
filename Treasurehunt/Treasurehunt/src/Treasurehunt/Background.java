package Treasurehunt;

import javax.swing.*;
import java.awt.*;

// ���
public class Background {
	public Container Background(Container c) {
		
		//���� ��� �̹��� ����
		ImageIcon ba = new ImageIcon("img\\bg3.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(1200, 770, Image.SCALE_SMOOTH);
		
		ImageIcon backg = new ImageIcon(back);
		JLabel bg = new JLabel(backg);
		bg.setBounds(0, -5, 1200, 770);
		c.add(bg);
		
		return c;
	}
}
