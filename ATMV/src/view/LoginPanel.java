package view;

import javax.swing.*;

/**
 * 输入密码面板
 *
 */
public class LoginPanel extends AbstractDisplayPanel{
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	public LoginPanel(){
		this.titleLabel.setText("请输入账户密码");
		this.rightBtn4.setText("确定");
		this.rightBtn4.setVisible(true);
		this.leftBtn4.setText("退卡");
		this.leftBtn4.setVisible(true);
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 200, 300, 30);
		this.add(passwordField);
	}
	public JPasswordField getPasswordField() {
		return passwordField;
	}

}
