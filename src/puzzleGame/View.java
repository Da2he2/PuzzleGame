package puzzleGame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {
	public View() {
		setTitle("이미지 조각 퍼즐 맞추기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(234,234,234));
		
		JLabel TitleLabel = new JLabel("이미지 조각 퍼즐 맞추기");
		TitleLabel.setLocation(50,50);
		TitleLabel.setSize(330,60);
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("Gothic",Font.BOLD,25));
		c.add(TitleLabel);
		
		JButton btnx3 = new JButton("3X3");
		btnx3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new x3_3();
				setVisible(false);
			}
		});
		btnx3.setBounds(150,140,150,60);
		btnx3.setBackground(Color.YELLOW);
		btnx3.setFont(new Font("Gothic",Font.BOLD,20));
		c.add(btnx3);
		
		JButton btnx4 = new JButton("4X4");
		btnx4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new x4_4();
				setVisible(false);
			}
		});
		btnx4.setBounds(150,240,150,60);
		btnx4.setBackground(Color.YELLOW);
		btnx4.setFont(new Font("Gothic",Font.BOLD,20));
		c.add(btnx4);
		
		JButton btnx5 = new JButton("5X5");
		btnx5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new x5_5();
				setVisible(false);
			}
		});
		
		btnx5.setBounds(150,340,150,60);
		btnx5.setBackground(Color.YELLOW);
		btnx5.setFont(new Font("Gothic",Font.BOLD,20));
		c.add(btnx5);
		
		
		setSize(450,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
