package physical;

import domain.ReceiptPrinter;
import experiment.Strawberry;

import javax.swing.*;

/**
 * 打印机模拟类
 * 实现ReceiptPrinter接口，使用JTextArea模拟
 *
 */
@Strawberry
public class ReceiptPrinterSimulation extends JTextArea implements ReceiptPrinter {
	private static final long serialVersionUID = 1L;

	@Override
	public void printReceipt(String content, boolean isAppend) {
		if (isAppend) {
			this.append(content);
		}else{
			this.setText(content);
		}
	}
}
