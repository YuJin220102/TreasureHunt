package Treasurehunt;

// 공격 기능 없음
// 단순 적 피하기

import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 1단계
public class Level1 extends JFrame {
	Container c = getContentPane();

	// 적이 없어졌는지 체크
	boolean Check1 = true;
	boolean Check2 = true;
	boolean Check3 = true;
	boolean Check4 = true;
	boolean Check5 = true;

	// 보물상자
	JLabel treasure = new JLabel();

	// 플레이어
	JLabel player = new JLabel();
	public int x = 140, y = 600;
	private final int FLYING_UNIT = 10;

	// 적
	int enemy1moveX, enemy1moveY;
	int enemy2moveX, enemy2moveY;
	int enemy3moveX, enemy3moveY;
	int enemy4moveX, enemy4moveY;
	int enemy5moveX, enemy5moveY;

	int[] ranX = { 0, 0, 0, 0, 0 };
	int[] ranY = { 0, 0, 0, 0, 0 };

	JLabel enemy1 = new JLabel();
	JLabel enemy2 = new JLabel();
	JLabel enemy3 = new JLabel();
	JLabel enemy4 = new JLabel();
	JLabel enemy5 = new JLabel();

	// 적 이동 시간 체크
	int enTime = 0;

	// 적 X위치 랜덤 생성 300 ~ 800
		public int ranX(int[] ranX, int index) {
			for (int i = 0; i < ranX.length; i++) {
				ranX[i] = (int) (Math.random() * 500) + 300;
			}
			return ranX[index];
		}


	Level1() {
		c.setLayout(null);
		
		enemy1moveX = ranX(ranX, 0); enemy1moveY = 100;
		enemy2moveX = ranX(ranX, 1); enemy2moveY = 400;
		enemy3moveX = ranX(ranX, 2); enemy3moveY = 300;
		enemy4moveX = ranX(ranX, 3); enemy4moveY = 200;
		enemy5moveX = ranX(ranX, 4); enemy5moveY = 500;
		
		// 1단계 이미지
		ImageIcon s = new ImageIcon("img\\stage1.png");
		Image st = s.getImage();
		Image sta = st.getScaledInstance(100, 50, Image.SCALE_SMOOTH);
		ImageIcon stag = new ImageIcon(sta);

		JLabel stage = new JLabel(stag);
		stage.setBounds(0, 5, 100, 50);
		c.add(stage);

		// 플레이어 이미지
		ImageIcon pl = new ImageIcon("img\\player1.png");
		Image pla = pl.getImage();
		Image play = pla.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon playe = new ImageIcon(play);

		player = new JLabel(playe);
		player.setBounds(140, 600, 80, 80);
		addKeyListener(new getkey());
		c.add(player);

		// 보물상자 이미지
		ImageIcon tr = new ImageIcon("img\\treasure1.png");
		Image tre = tr.getImage();
		Image trea = tre.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		ImageIcon treas = new ImageIcon(trea);

		treasure = new JLabel(treas);
		treasure.setBounds(960, 20, 90, 90);
		c.add(treasure);

		// 느린적 이미지1
		ImageIcon e = new ImageIcon("img\\Enemy.png");
		Image en = e.getImage();
		Image ene = en.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon enem = new ImageIcon(ene);

		enemy1 = new JLabel(enem);
		enemy1.setBounds(enemy1moveX, enemy1moveY, 80, 80);
		c.add(enemy1);

		// 느린적 이미지1
		ImageIcon e2 = new ImageIcon("img\\Enemy.png");
		Image en2 = e2.getImage();
		Image ene2 = en2.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon enem2 = new ImageIcon(ene2);

		enemy2 = new JLabel(enem2);
		enemy2.setBounds(enemy2moveX, enemy2moveY, 80, 80);
		c.add(enemy2);

		// 느린적 이미지3
		ImageIcon e3 = new ImageIcon("img\\Enemy.png");
		Image en3 = e3.getImage();
		Image ene3 = en3.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon enem3 = new ImageIcon(ene3);

		enemy3 = new JLabel(enem3);
		enemy3.setBounds(enemy3moveX, enemy3moveY, 80, 80);
		c.add(enemy3);

		// 고정적 이미지1
		ImageIcon e4 = new ImageIcon("img\\Enemy.png");
		Image en4 = e4.getImage();
		Image ene4 = en4.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon enem4 = new ImageIcon(ene4);

		enemy4 = new JLabel(enem4);
		enemy4.setBounds(enemy4moveX, enemy4moveY, 80, 80);
		c.add(enemy4);

		// 고정적 이미지2
		ImageIcon e5 = new ImageIcon("img\\Enemy.png");
		Image en5 = e5.getImage();
		Image ene5 = en5.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon enem5 = new ImageIcon(ene5);

		enemy5 = new JLabel(enem5);
		enemy5.setBounds(enemy5moveX, enemy5moveY, 80, 80);
		c.add(enemy5);

		// 배경
		Background bg = new Background();
		bg.Background(c);

		// 적 움직임, 플레이어 적 부딪힘
		Timer n = new Timer();
		TimerTask t = new TimerTask() {
			public void run() {
				// 적움직임
				if (enTime < 15) {
					enemy1moveX += 10;
					enemy1.setLocation(enemy1moveX, enemy1moveY);

					enemy2moveX -= 10;
					enemy2.setLocation(enemy2moveX, enemy2moveY);

					enemy3moveX += 10;
					enemy3.setLocation(enemy3moveX, enemy3moveY);

				} else if (enTime < 30) {
					enemy1moveX -= 10;
					enemy1.setLocation(enemy1moveX, enemy1moveY);

					enemy2moveX += 10;
					enemy2.setLocation(enemy2moveX, enemy2moveY);

					enemy3moveX -= 10;
					enemy3.setLocation(enemy3moveX, enemy3moveY);

					if (enTime == 29)
						enTime = 0;
				}
				enTime++;

				// 플레이어가 적 부딪힘
				if ((y > enemy1.getY() - 75 && y < enemy1.getY() + 75 && x > enemy1.getX() - 60
						&& x < enemy1.getX() + 60)) {
					if (Check1 == true) {
						new Failed();
						setVisible(false);
						try {
							Thread.sleep(1000000000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				if ((y > enemy2.getY() - 75 && y < enemy2.getY() + 75 && x > enemy2.getX() - 60
						&& x < enemy2.getX() + 60)) {
					if (Check2 == true) {
						new Failed();
						setVisible(false);
						try {
							Thread.sleep(1000000000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				if ((y > enemy3.getY() - 75 && y < enemy3.getY() + 75 && x > enemy3.getX() - 60
						&& x < enemy3.getX() + 60)) {
					if (Check3 == true) {
						new Failed();
						setVisible(false);
						try {
							Thread.sleep(1000000000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				if ((y > enemy4.getY() - 75 && y < enemy4.getY() + 75 && x > enemy4.getX() - 60
						&& x < enemy4.getX() + 60)) {
					if (Check4 == true) {
						new Failed();
						setVisible(false);
						try {
							Thread.sleep(1000000000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				if ((y > enemy5.getY() - 75 && y < enemy5.getY() + 75 && x > enemy5.getX() - 60
						&& x < enemy5.getX() + 60)) {
					if (Check5 == true) {
						new Failed();
						setVisible(false);
						try {
							Thread.sleep(1000000000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		n.schedule(t, 100, 100); // 1초 뒤에 1초마다 run 메소드 수행

		// 창
		setSize(1200, 800);
		setVisible(true);
		setLocationRelativeTo(null); // 창 가운데 배치
		setResizable(false); // 창 크기 고정

		// 종료시 완전 히 끔
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class getkey extends KeyAdapter {
		public void keyPressed(KeyEvent e) {

			int keyCode = e.getKeyCode();
			switch (keyCode) {

			case KeyEvent.VK_SPACE:
				// 보물 찾을 시 
				if ((y - 30 > treasure.getY() - 65 && y < treasure.getY() + 65 && x - 30 > treasure.getX() - 65
						&& x < treasure.getX() + 65)) {
					new Pass();
					setVisible(false);
				}
				break;

			// up , w -> 플레이어 위로 이동
			case KeyEvent.VK_UP:
			case KeyEvent.VK_W:
				if (y == 70)
					// || player.getY() > wall.wall(c).getY()
					break;
				else {
					y = player.getY() - FLYING_UNIT;
					player.setLocation(player.getX(), y);
					break;
				}

				// down , s -> 플레이어 아래로 이동
			case KeyEvent.VK_DOWN:
			case KeyEvent.VK_S:
				if (y == 610)
					break;
				else {
					y = player.getY() + FLYING_UNIT;
					player.setLocation(player.getX(), y);
					break;
				}

				// left , a -> 플레이어 왼쪽로 이동
			case KeyEvent.VK_LEFT:
			case KeyEvent.VK_A:
				if (x == 50)
					break;
				else {
					x = player.getX() - FLYING_UNIT;
					player.setLocation(x, player.getY());
					break;
				}

				// right , d -> 플레이어 오른로 이동
			case KeyEvent.VK_RIGHT:
			case KeyEvent.VK_D:
				if (x == 1050)
					break;
				else {
					x = player.getX() + FLYING_UNIT;
					player.setLocation(x, player.getY());
					break;
				}
			}
		}
	}

}
