package com.adambarrell.swaggerexample;

public class GiftCard {

    private String cardNo           = "6337344567891323";
    private String totalAmount      = "&pound;500.00";
    private String remainingBalance = "&pound;0.00";

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(String remainingBalance) {
        this.remainingBalance = remainingBalance;
    }
}
