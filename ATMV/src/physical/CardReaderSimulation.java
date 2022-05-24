package physical;

import domain.Card;
import domain.CardReader;
import experiment.Inject;
import experiment.Strawberry;
import remote.AccountTransactionService;

import javax.swing.*;


/**
 * 读卡器模拟类
 * 实现CardReader，使用JTextField模拟
 *
 */
@Strawberry
public class CardReaderSimulation extends JTextField implements CardReader{
	private static final long serialVersionUID = 1L;
	@Inject
	private AccountTransactionService service;


	@Override
	public Card readCard(String id) {
		return service.validate(id);
	}

	@Override
	public void exitCard() {
		// TODO 交给你了
	}

	@Override
	public void keepCard() {
		// TODO 交给你了
	}

}
