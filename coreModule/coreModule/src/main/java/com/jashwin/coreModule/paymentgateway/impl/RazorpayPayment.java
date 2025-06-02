package com.jashwin.coreModule.paymentgateway.impl;

import com.jashwin.coreModule.paymentgateway.Payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("razorpay")
//@Primary
public class RazorpayPayment implements Payment {
    @Override
    public String doPayment(String accountNumber, int amount) {

        //call razor paymethods
        return "Success from Razorpay";
    }
}
