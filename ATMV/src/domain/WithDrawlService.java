package domain;

/**
 * @apiNote
 * @author Ether
 * @since  2022/5/24
 **/
public interface WithDrawlService {
    /**
     * Get money.
     * @param card Operation Object.
     * @param cashDispenser Control the cash box.
     * @return error message.
     * 		   null if everything is fine.
     */
    String withDrawl(Double crashInATM, Integer want, Card card, CashDispenser cashDispenser);

}
