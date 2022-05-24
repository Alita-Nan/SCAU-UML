package domain;

import experiment.Inject;
import experiment.Strawberry;
import physical.CashDispenserSimulation;
import physical.ReceiptPrinterSimulation;

/**
 * 控制器
 * 参考GRASP1控制器设计模式
 * ATM对象接收系统顺序图中所有事件
 */
@Strawberry
public class ATM {
	@Inject
	private CardReader cardReader; //建立ATM和cardReader关联。
	private CashDispenser cashDispenser;
	private ReceiptPrinter receiptPrinter;
	/**
	 *  If atm accept a validated card, then it will receive data from AccountTransactionService.
	 */
	private Card card;

	@Inject
	private WithDrawlService withDrawlService;

	@Inject
	private PrintService printService;


	/**
	 * XXXXXX
	 * 系统顺序图中的第一个事件。
	 */
	public boolean validate(String password){  //返回类型、方法名、参数各组自行设计
		//1个事件1张顺序图+1张类图
		//代码实现。
		//评判要求：代码和模型要求吻合；建议先画模型，至少草图，然后写代码。
		return card.getAccount().getPassword().equals(password);
	}

	/**
	 * 系统顺序图中的第二个事件。
	 */
	public String withDrawl(Double crashInATM, Integer want){ //返回类型、方法名、参数各组自行设计
		return withDrawlService.withDrawl(crashInATM, want, card, cashDispenser);
	}

	/**
	 * XXXXXX
	 * 系统顺序图中的第三个事件。
	 */
  	public String print(){ //返回类型、方法名、参数各组自行设计
		return printService.print(card.getID());
	}


	/**
	 * XXXXXX
	 * 系统顺序图中的第N个事件。
	 */
	public void operationN(){  //返回类型、方法名、参数各组自行设计

	}

	/**
	 * ATM开机
	 */
	public void turnOn(){
		cashDispenser = new CashDispenserSimulation(10000.00);  //模拟钞箱中放入10000元
		receiptPrinter = new ReceiptPrinterSimulation();
	}
	//getter
	public CardReader getCardReader() {
		return cardReader;
	}
	public CashDispenser getCashDispenser() {
		return cashDispenser;
	}
	public ReceiptPrinter getReceiptPrinter() {
		return receiptPrinter;
	}

	public void setCard(Card card) {
		this.card = card;
	}


}
