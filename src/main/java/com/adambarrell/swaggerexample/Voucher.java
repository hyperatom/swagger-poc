package com.adambarrell.swaggerexample;

public class Voucher {

    private String cardNo      = "1234567891302";
    private String totalAmount = "&pound;100.00";

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
}
