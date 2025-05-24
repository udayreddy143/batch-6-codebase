package com.jashwin.coreModule.service;

import com.jashwin.coreModule.paymentgateway.Payment;
import com.jashwin.coreModule.paymentgateway.impl.BillDeskPayment;
import com.jashwin.coreModule.paymentgateway.impl.RazorpayPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Value("${core.name}")
    private String name;

    @Autowired
    @Qualifier("billDesk")
    private Payment payment;

   public  EmployeeService(){
        System.out.println("this is employee Service ");

    }

    public String display(){


       String accountNumber="123";
       int amount =20;

       // Payment payment= new BillDeskPayment();
        String response = payment.doPayment(accountNumber,amount);
        return response;
    }
}
