package view;

import javax.swing.*;
import java.awt.*;

/**
 * 显示面板模板类
 * ATM显示器所有面板继承此类，简化面板代码量
 *
 */
public abstract class AbstractDisplayPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	protected JLabel titleLabel,infoLabel;
	protected JButton leftBtn1,leftBtn2,leftBtn3,leftBtn4,rightBtn1,rightBtn2,rightBtn3,rightBtn4;

	public AbstractDisplayPanel(){
		this.setLayout(null);
		this.setBounds(0, 0, 700, 400);
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.RED);
		this.initLabel();
		this.initButton();
	}
	public void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("img/bg.jpg");
		super.paintComponent(g);
		g.drawImage(icon.getImage(), 0, 0,this.getWidth(), this.getHeight(), this);
	}
	public void initLabel(){
		//面板标题
		titleLabel = new JLabel();
		titleLabel.setFont(new Font("微软雅黑",Font.BOLD,20));
		titleLabel.setBounds(250, 80, 300, 50);
		titleLabel.setForeground(Color.RED);
		this.add(titleLabel);

		//消息提示
		infoLabel = new JLabel();
		infoLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		infoLabel.setForeground(Color.BLUE);
		infoLabel.setBounds(300, 280, 300, 100);
		this.add(infoLabel);
	}
	public void initButton(){
		//左右各4个按钮，默认都不可见，根据面板业务需求显示并设置text
		leftBtn1 = new JButton();
		leftBtn1.setFont(new Font("微软雅黑",Font.BOLD,14));
		leftBtn1.setBounds(50, 100, 100, 40);
		leftBtn1.setVisible(false);
		this.add(leftBtn1);


		leftBtn2 = new JButton();
		leftBtn2.setFont(new Font("微软雅黑",Font.BOLD,14));
		leftBtn2.setBounds(50, 170, 100, 40);
		leftBtn2.setVisible(false);
		this.add(leftBtn2);


		leftBtn3 = new JButton();
		leftBtn3.setFont(new Font("微软雅黑",Font.BOLD,14));
		leftBtn3.setBounds(50, 240, 100, 40);
		leftBtn3.setVisible(false);
		this.add(leftBtn3);

		leftBtn4 = new JButton();
		leftBtn4.setFont(new Font("微软雅黑",Font.BOLD,14));
		leftBtn4.setBounds(50, 310, 100, 40);
		leftBtn4.setVisible(false);
		this.add(leftBtn4);

		rightBtn1 = new JButton();
		rightBtn1.setFont(new Font("微软雅黑",Font.BOLD,14));
		rightBtn1.setBounds(550, 100, 100, 40);
		rightBtn1.setVisible(false);
		this.add(rightBtn1);

		rightBtn2 = new JButton();
		rightBtn2.setFont(new Font("微软雅黑",Font.BOLD,14));
		rightBtn2.setBounds(550, 170, 100, 40);
		rightBtn2.setVisible(false);
		this.add(rightBtn2);

		rightBtn3 = new JButton();
		rightBtn3.setFont(new Font("微软雅黑",Font.BOLD,14));
		rightBtn3.setBounds(550, 240, 100, 40);
		rightBtn3.setVisible(false);
		this.add(rightBtn3);

		rightBtn4 = new JButton();
		rightBtn4.setFont(new Font("微软雅黑",Font.BOLD,14));
		rightBtn4.setBounds(550, 310, 100, 40);
		rightBtn4.setVisible(false);
		this.add(rightBtn4);
	}
	public JLabel getTitleLabel() {
		return titleLabel;
	}
	public JLabel getInfoLabel() {
		return infoLabel;
	}
	public JButton getLeftBtn1() {
		return leftBtn1;
	}
	public JButton getLeftBtn2() {
		return leftBtn2;
	}
	public JButton getLeftBtn3() {
		return leftBtn3;
	}
	public JButton getLeftBtn4() {
		return leftBtn4;
	}
	public JButton getRightBtn1() {
		return rightBtn1;
	}
	public JButton getRightBtn2() {
		return rightBtn2;
	}
	public JButton getRightBtn3() {
		return rightBtn3;
	}
	public JButton getRightBtn4() {
		return rightBtn4;
	}
}
