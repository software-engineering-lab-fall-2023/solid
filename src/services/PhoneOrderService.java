package services;

import interfaces.PaymentService;
import interfaces.RegisterService;

public class PhoneOrderService implements RegisterService, PaymentService {
    @Override
    public void register(String customerName) {
        System.out.println("phone order registered for " + customerName);
    }

    @Override
    public void payment(int foodPrice) {
        System.out.println("phone Payment with Price : " + foodPrice + " Tomans!");
    }
}
