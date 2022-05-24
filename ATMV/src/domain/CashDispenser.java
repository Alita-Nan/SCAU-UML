package domain;

/**
 * 钞箱接口
 *
 */
public interface CashDispenser {
	/**
	 * 打开吐钞口
	 * 吐钞
	 */
	public void dispenseCash(Integer want); //返回值及参数各组自行设计
	/**
	 * 关闭吐钞口
	 * 顾客取走现金
	 */
	public void close(); //返回值及参数各组自行设计
}
