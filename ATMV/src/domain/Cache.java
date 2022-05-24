package domain;

import java.util.HashMap;
import java.util.Map;

/**
 *  Cache store in Memory.
 * @author Ether
 *
 */
public class Cache {
	/**
	 *  Key: ID of card - Value: account
	 *  @see Card
	 */
	private static volatile Map<String, Card> ID_ACCOUNT;

	private final static Object mutex = new Object();
	/**
	 *  Singleton patter.
	 *  Notice that this method is the key to maintain consistent data.
	 * @author Ether
	 */
	public static Map<String, Card> getCache(){
		if(ID_ACCOUNT == null) {
			synchronized (mutex) {
				if(ID_ACCOUNT == null) {
					ID_ACCOUNT = new HashMap<>();
					Account account = new Account("Jesus", "1", 10000.0, false);
					Card card = new Card("1001", account);
//					 Initialize the data here.
//					 Notice that this is a fool way.
					ID_ACCOUNT.put(card.getID(), card);
				}
			}
		}
		return ID_ACCOUNT;
	}
	/**
	 *  Another way to get single instance.
	 * @author Ether
	 *
	 */
//	public static class AccountCache{
//		private static Map<String, Account> ACCOUNT_CACHE = new HashMap<>();
//		public static Map<String, Account> getAccountCache(){
//			return ACCOUNT_CACHE;
//		}
//	}

}
