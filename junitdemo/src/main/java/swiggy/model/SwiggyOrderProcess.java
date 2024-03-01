package swiggy.model;

import java.util.Date;
import java.util.UUID;

public abstract  class SwiggyOrderProcess {
    SwiggyPaymentService swiggyPaymentService;

    public SwiggyOrderProcess(SwiggyPaymentService swiggyPaymentService) {
        this.swiggyPaymentService=swiggyPaymentService;
    }

    public Order getFinalOrder(Order order){
        double tax=0;
        if(order.getPrice() >1000){
            tax=order.getPrice()*20/10;
        }
     double finalAmt= order.getPrice()+tax+20;
        Order finalOrder=new Order(finalAmt,20,20,"false");
     finalOrder.setOrderItemList(order.orderItemList);
     return finalOrder;
    }
    public Order createOrder(Order order){
        Order finalOrder=getFinalOrder(order);
        PaymentRequest paymentInitationRequest=new PaymentRequest("Swiggy"+UUID.randomUUID().toString(),finalOrder.getPrice(),
                new Date(),false,"655");
        PaymentResponse response = swiggyPaymentService.payment(paymentInitationRequest);
        if (response!=null){
            finalOrder.setStatus("success");
            System.out.println(response.getCorelationId());

    }
        delivery(finalOrder);
        return finalOrder;


}
public abstract boolean delivery(Order order);
}
