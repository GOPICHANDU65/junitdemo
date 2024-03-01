package swiggy.model;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {

    @Override
    public PaymentResponse payment(PaymentRequest request) {
       PaymentRequest paymentInitationRequest
               = new PaymentRequest("Swiggy"+UUID.randomUUID().toString(),
         request.getAmt(), request.getTxnDate(),false,"6565");
        SBIBankService sbi = new SBIBankService();
        return sbi.transfer(paymentInitationRequest);

    }
}
