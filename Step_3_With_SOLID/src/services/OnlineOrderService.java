package services;

import interfaces.PaymentService;
import interfaces.RegisterService;

public class OnlineOrderService implements RegisterService, PaymentService {
    @Override
    public void register(String customerName) {
        System.out.println("online order registered for " + customerName);
    }

    @Override
    public void payment(int foodPrice) {
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }
}
