package com.adambarrell.swaggerexample;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;
import java.util.List;

public class PrePaidResponse {

    private Boolean success               = true;
    private String  totalVoucherAmt       = "&pound;200.00";
    private String  totalGCAmt            = "&pound;932.50";
    private String  totalBalanceRemaining = "&pound;0.00";
    private Boolean maxLimitCrossed       = false;

    private List<Voucher> voucherList     = Arrays.asList(
            new Voucher(), new Voucher()
    );

    private List<GiftCard> giftCardList   = Arrays.asList(
            new GiftCard(), new GiftCard()
    );

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTotalVoucherAmt() {
        return totalVoucherAmt;
    }

    public void setTotalVoucherAmt(String totalVoucherAmt) {
        this.totalVoucherAmt = totalVoucherAmt;
    }

    public String getTotalGCAmt() {
        return totalGCAmt;
    }

    public void setTotalGCAmt(String totalGCAmt) {
        this.totalGCAmt = totalGCAmt;
    }

    public String getTotalBalanceRemaining() {
        return totalBalanceRemaining;
    }

    public void setTotalBalanceRemaining(String totalBalanceRemaining) {
        this.totalBalanceRemaining = totalBalanceRemaining;
    }

    public Boolean getMaxLimitCrossed() {
        return maxLimitCrossed;
    }

    public void setMaxLimitCrossed(Boolean maxLimitCrossed) {
        this.maxLimitCrossed = maxLimitCrossed;
    }

    public List<Voucher> getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(List<Voucher> voucherList) {
        this.voucherList = voucherList;
    }

    public List<GiftCard> getGiftCardList() {
        return giftCardList;
    }

    public void setGiftCardList(List<GiftCard> giftCardList) {
        this.giftCardList = giftCardList;
    }
}
