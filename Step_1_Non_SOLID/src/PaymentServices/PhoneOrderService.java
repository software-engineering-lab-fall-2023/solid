package PaymentServices;

public class PhoneOrderService implements OrderService {
    @Override
    public void onSiteOrderRegister(String customerName) {
        //Empty Body!
    }

    @Override
    public void onlineOrderRegister(String customerName) {
        //Empty Body!
    }

    @Override
    public void onSiteOrderPayment(int foodPrice) {
        //Empty Body
    }

    @Override
    public void onlineOrderPayment(int foodPrice) {
        //Empty Body
    }

    @Override
    public void phoneOrderRegister(String customerName) {
        System.out.println("phone order registered for " + customerName);
    }

    @Override
    public void phoneOrderPayment(int foodPrice) {
        System.out.println("phone Payment with Price : " + foodPrice + " Tomans!");
    }
}
