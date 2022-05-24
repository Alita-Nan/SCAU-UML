package remote;

import domain.Account;
import domain.Cache;
import domain.Card;
import domain.Operation;
import experiment.Strawberry;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/**
 * 模拟远程账户交易类，ATM实际为客户端系统，需要远程账户交易系统作为后台。
 * 本程序简化直接使用本地类。
 * 服务类设计可参考NextGenPos将账户对象加载内存方式，使用HashMap<String(卡号),Account(账户类)>将测试数据加载入内存。

 * 更形象各组可以单独设计远程服务程序。
 * ATM和远程服务程序之间通讯，可采用socket、web service soap或restful Api接口
 * 推荐各组将账户交易系统单独设计成程序。具体实现方式各组自行设计完成。
 */
@Strawberry
public class AccountTransactionService {

	private Map<String, Card> database;

	private Map<String, LinkedList<Operation>> cardId_Operations;

	public AccountTransactionService() {
		database = Cache.getCache();
		cardId_Operations = new HashMap<>();
	}

	/**
	 * 远程账户验证服务
	 */
	public Card validate(String id){ //返回值及参数各组自行设计
		Card card = database.get(id);
		if(Objects.isNull(card)) {
			return null;
		}else {
			return database.get(id);
		}
	}

	/**
	 * 远程账户交易服务
	 */
	public boolean withDrawl(String id, Integer want){ //返回值及参数各组自行设计
		Account account = database.get(id).getAccount();
		Double balance = account.getBalance();
		if(want > balance){
			return false;
		}else{
			// Update data...
			account.setBalance(balance - want);
			return true;
		}
	}

	public Operation getOperation(String cardId){
		LinkedList<Operation> operations = this.cardId_Operations.get(cardId);
		if (operations.isEmpty()) {
			return null;
		}
		// Always return the last operation. Because it's create time is close to current time.
		return operations.getLast();
	}

	public void setOperation(Operation operation){
		this.cardId_Operations.computeIfAbsent(operation.getCardId(), v -> new LinkedList<>());
		cardId_Operations.get(operation.getCardId()).add(operation);
	}

}
