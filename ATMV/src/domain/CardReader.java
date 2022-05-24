package domain;

/**
 * 读卡器接口
 *
 */
public interface CardReader {
	/**
	 * 读卡
	 */
	public Card readCard(String id);  //返回值及参数各组自行设计
	
	/**
	 * 退卡
	 */
	public void exitCard(); //返回值及参数各组自行设计
	
	/**
	 * 吞卡
	 */
	public void keepCard(); //返回值及参数各组自行设计
}
