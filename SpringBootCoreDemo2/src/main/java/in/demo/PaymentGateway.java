package in.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

//    private String type;
//
//    private int retryCount;

//    public PaymentGateway(@Value ( "${paymentGateway.type}" )String type ,
//                          @Value ( "${paymentGateway.retryCount}" )int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }
    private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return paymentProperties.getType();
    }
    public int getRetryCount() {
       return paymentProperties.getRetryCount ();
    }
    public boolean isEnabled() {
        return paymentProperties.isEnabled ();
    }
    public int getTimeout() {
        return paymentProperties.getTimeout ();
    }

    public void print(){
        System.out.println("PaymentGateway type: " + getType());
        System.out.println("PaymentGateway retryCount: " + getRetryCount());
        System.out.println("PaymentGateway enabled: " + isEnabled());
        System.out.println("PaymentGateway timeout: " + getTimeout());
    }
}
