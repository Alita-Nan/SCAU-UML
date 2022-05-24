package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 输入取款金额面板
 *
 */
public class WithdrawPanel extends AbstractDisplayPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JTextField amountTextField;
	public WithdrawPanel(){
		this.titleLabel.setText("请输入取款金额");
		this.leftBtn1.setText("100");
		this.leftBtn1.setVisible(true);
		this.leftBtn1.addActionListener(this);

		this.leftBtn2.setText("300");
		this.leftBtn2.setVisible(true);
		this.leftBtn2.addActionListener(this);

		this.leftBtn3.setText("500");
		this.leftBtn3.setVisible(true);
		this.leftBtn3.addActionListener(this);

		this.leftBtn4.setText("取消");
		this.leftBtn4.setVisible(true);

		this.rightBtn1.setText("1000");
		this.rightBtn1.setVisible(true);
		this.rightBtn1.addActionListener(this);

		this.rightBtn2.setText("2000");
		this.rightBtn2.setVisible(true);
		this.rightBtn2.addActionListener(this);

		this.rightBtn3.setText("3000");
		this.rightBtn3.setVisible(true);
		this.rightBtn3.addActionListener(this);

		this.rightBtn4.setText("确定");
		this.rightBtn4.setVisible(true);

		amountTextField = new JTextField();
		amountTextField.setBounds(200, 200, 300, 30);
		amountTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String key="0123456789"+(char)8;
				if(key.indexOf(e.getKeyChar())<0){
					// Input cancel if is not a number.
					e.consume();
				}
			}
		});
		this.add(amountTextField);
	}
	public JTextField getAmountTextField() {
		return amountTextField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==leftBtn1){
			amountTextField.setText("100");
		}
		else if(e.getSource()==leftBtn2){
			amountTextField.setText("300");
		}
		else if(e.getSource()==leftBtn3){
			amountTextField.setText("500");
		}
		else if(e.getSource()==rightBtn1){
			amountTextField.setText("1000");
		}
		else if(e.getSource()==rightBtn2){
			amountTextField.setText("2000");
		}
		else if(e.getSource()==rightBtn3){
			amountTextField.setText("3000");
		}

	}

}
