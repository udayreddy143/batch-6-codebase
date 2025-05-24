package com.jashwin.coreModule.paymentgateway.impl;

import com.jashwin.coreModule.paymentgateway.Payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("billDesk")
//@Primary
public class BillDeskPayment implements Payment {
    @Override
    public String doPayment(String accountNumber, int amount) {
        //redbus has to call BIllDesk
        return "success from billDesk";
    }
}
