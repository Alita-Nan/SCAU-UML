package physical;


import domain.CashDispenser;

import javax.swing.*;

/**
 * 钞箱模拟类
 * 实现CashDispenser接口，使用JButton模拟
 *
 */
public class CashDispenserSimulation extends JButton implements CashDispenser{
	private static final long serialVersionUID = 1L;
	private double cashBalance; // 钞箱现金余额
	public CashDispenserSimulation(double cashBalance) {
		super();
		this.cashBalance = cashBalance;
		this.setEnabled(false);  //初始按钮不可用
		this.setText("钞箱余额"+cashBalance);
	}

	public double getCashBalance() {
		return cashBalance;
	}

	/**
	 * 吐钞
	 *
	 */
	@Override
	public void dispenseCash(Integer want) {
		// Update data...
		cashBalance -= want;
	}

	@Override
	public void close() {
		// Reset the button and display the new balance.
		this.setText("钞箱余额" + cashBalance);
		this.setEnabled(false);
	}

}
