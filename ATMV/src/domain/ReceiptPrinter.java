package domain;

/**
 * 凭证打印机接口
 *
 */
public interface ReceiptPrinter {
	/**
	 * 打印凭证
	 */
	public void printReceipt(String content, boolean isAppend); //返回值及参数各组自行设计
}
