package domain;

import experiment.Inject;
import experiment.Strawberry;
import remote.AccountTransactionService;

import java.text.SimpleDateFormat;

@Strawberry
public class PrintServiceImpl implements PrintService{

    @Inject
    AccountTransactionService service;
    @Override
    public String print(String cardId) {
        Operation operation = service.getOperation(cardId);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("卡号：").append(operation.getCardId()).append("于")
                .append(sf.format(operation.getTime())).append("进行")
                .append(operation.getOperate()).append("操作")
                .append("。金额：").append(operation.getAmount()).append("元");
        return sb.toString();
    }
}
