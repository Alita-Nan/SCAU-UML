package domain;

import java.util.Date;

/**
 * @apiNote Record operation happen on one card.
 * @author Ether
 * @since  2022/5/25
 **/
public class Operation {
    private String cardId;
    private String operate;
    private Double amount;

    private Date time;

    @Override
    public String toString() {
        return "Operation{" +
                "cardId='" + cardId + '\'' +
                ", operate='" + operate + '\'' +
                ", amount=" + amount +
                ", time=" + time +
                '}';
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
