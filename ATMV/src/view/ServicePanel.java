package view;

/**
 * 交易服务类型面板
 *
 */
public class ServicePanel extends AbstractDisplayPanel{
	private static final long serialVersionUID = 1L;
	public ServicePanel(){
		this.titleLabel.setText("请选择交易类型");
		this.leftBtn1.setText("取钱");
		this.leftBtn1.setVisible(true);
		this.leftBtn2.setText("转账");
		this.leftBtn2.setVisible(true);
		this.rightBtn1.setText("存钱");
		this.rightBtn1.setVisible(true);
		this.rightBtn2.setText("查询余额");
		this.rightBtn2.setVisible(true);
		this.leftBtn4.setText("退卡");
		this.leftBtn4.setVisible(true);		
	}	
}
