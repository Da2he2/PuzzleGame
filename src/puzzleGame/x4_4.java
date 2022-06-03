package puzzleGame;
import java.awt.*;
import java.awt.event.MouseListener;

import javax.swing.*;

public class x4_4 extends JFrame{
	
	private final int imgSizeX[] = {250,250,250,250};
	private final int imgSizeY[] = {250,250,250,250};
	private final int imgLocX[] = {0,imgSizeX[0],imgSizeX[0]+imgSizeX[1],imgSizeX[0]+imgSizeX[1]+imgSizeX[2]};
	private final int imgLocY[] = {0,imgSizeY[0],imgSizeY[0]+imgSizeY[1],imgSizeY[0]+imgSizeY[1]+imgSizeY[2]};
	
	private ImageIcon [] images = {
			new ImageIcon("src/4x4/01.jpg"),
			new ImageIcon("src/4x4/02.jpg"),
			new ImageIcon("src/4x4/03.jpg"),
			new ImageIcon("src/4x4/04.jpg"),
			new ImageIcon("src/4x4/05.jpg"),
			new ImageIcon("src/4x4/06.jpg"),
			new ImageIcon("src/4x4/07.jpg"),
			new ImageIcon("src/4x4/08.jpg"),
			new ImageIcon("src/4x4/09.jpg"),
			new ImageIcon("src/4x4/10.jpg"),
			new ImageIcon("src/4x4/11.jpg"),
			new ImageIcon("src/4x4/12.jpg"),
			new ImageIcon("src/4x4/13.jpg"),
			new ImageIcon("src/4x4/14.jpg"),
			new ImageIcon("src/4x4/15.jpg"),
			new ImageIcon("src/4x4/16.jpg")
	};
	
	private JLabel [] imgLabel = {
			new JLabel(images[0]),
			new JLabel(images[1]),
			new JLabel(images[2]),
			new JLabel(images[3]),
			new JLabel(images[4]),
			new JLabel(images[5]),
			new JLabel(images[6]),
			new JLabel(images[7]),
			new JLabel(images[8]),
			new JLabel(images[9]),
			new JLabel(images[10]),
			new JLabel(images[11]),
			new JLabel(images[12]),
			new JLabel(images[13]),
			new JLabel(images[14]),
			new JLabel(images[15])
	};
	
	private Container c;
	
	public x4_4() {
		int i;
		setTitle("Venom VS SpiderMan");
		c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MyMouseListener());
		
		GameSystem.init();
		for(i=0;i<=14;i++) {
			imgLabel[i].setSize(imgSizeX[i%3],imgSizeY[i%4]);
		}
		
		for(i=0;i<=14;i++) {
			imgLabel[GameSystem.getValue(i)].setLocation(imgLocX[i%3],imgLocY[i%4]);
		}
		
		imgLabel[15].setSize(0,0);
		
		for(i=0;i<=15;i++) {
			c.add(imgLabel[i]);
		}
		
		setSize(2000,1000);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new x4_4();
	}

}
