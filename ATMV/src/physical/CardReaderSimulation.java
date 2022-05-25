package physical;

import domain.Card;
import domain.CardReader;
import experiment.Inject;
import experiment.Strawberry;
import remote.AccountTransactionService;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


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
	/**
	 *  If atm accept a validated card, then this will maintain data from AccountTransactionService.
	 */
	private Card card;

	@Override
	public boolean readCard(String id) {
		Card validate = service.validate(id);
		if (validate != null) {
			card = validate;
		}
		return validate != null;
	}

	@Override
	public void exitCard(String id) {
		// Delete information of the exited card.
		card = null;
	}

	@Override
	public void keepCard() {
		// TODO 交给你了
	}

	@Override
	public Card getData() {
		return card;
	}
}
