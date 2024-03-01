package swiggy.model;

import java.util.Date;

public class PaymentRequest {
    private String txId;
    private double amt;
    private Date txnDate;

    public String getMerchantId() {
        return merchantId;
    }

    private String merchantId;

    private boolean isMerchantDebit;

    public PaymentRequest( double amt, Date txnDate) {
        this.amt = amt;
        this.txnDate = txnDate;
    }

    public PaymentRequest(String txId, double amt, Date txnDate, boolean isMerchantDebit,String merchantId) {
        this.txId = txId;
        this.amt = amt;
        this.txnDate = txnDate;
        this.merchantId=merchantId;
        this.isMerchantDebit = isMerchantDebit;
    }

    public String getTxId() {
        return txId;
    }

    public double getAmt() {
        return amt;
    }

    public Date getTxnDate() {
        return txnDate;
    }
    public boolean isMerchantDebit() {
        return isMerchantDebit;
    }
}
