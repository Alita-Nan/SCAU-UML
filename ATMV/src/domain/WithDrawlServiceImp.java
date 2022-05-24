package domain;

import experiment.Inject;
import experiment.Strawberry;
import remote.AccountTransactionService;

import java.util.Date;

/**
 * @apiNote
 * @author Ether
 * @since  2022/5/24
 **/
@Strawberry
public class WithDrawlServiceImp implements WithDrawlService{
    @Inject
    private AccountTransactionService service;

    @Override
    public String withDrawl(Double crashInATM, Integer want, Card card, CashDispenser cashDispenser) {
        if(crashInATM < want){
            return "该ATM中没有足够的现金！😥";
        }
        boolean isSuccess =  service.withDrawl(card.getID(), want);
        if (isSuccess){
            cashDispenser.dispenseCash(want);
            // Update local data.
            card.getAccount().setBalance(card.getAccount().getBalance() - want);
            Operation operation = new Operation();
            operation.setOperate("取款");
            operation.setAmount(Double.valueOf(want));
            operation.setCardId(card.getID());
            operation.setTime(new Date());
            // Save information of operation.
            service.setOperation(operation);
            return null;
        }
        return "账户余额不足!!!🤔";
    }

}
