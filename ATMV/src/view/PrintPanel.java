package view;

/**
 * 询问打印面板
 *
 */
public class PrintPanel extends AbstractDisplayPanel{
	private static final long serialVersionUID = 1L;

	public PrintPanel(){
		this.titleLabel.setText("是否打印凭证");
		this.rightBtn4.setText("是");
		this.rightBtn4.setVisible(true);
		this.leftBtn4.setText("否");
		this.leftBtn4.setVisible(true);
	}
}
