import interfaces.PaymentService;
import services.OnSiteOrderService;
import services.OnlineOrderService;
import interfaces.RegisterService;
import services.PhoneOrderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegisterService registerService;
        PaymentService paymentService;
        String customerName;
        Order order;
        int customerAnswerForOrder = 0;
        int customerAnswerForPaymentMethod = 0;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        //Step 1 : Select Order Items
        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("pizza", 2000));
            }


        }

        //Step2 : Select Payment Method
        System.out.println("Enter Your Payment Method (1 for online and 2 for on-site and 3 for phone):");
        customerAnswerForPaymentMethod = scanner.nextInt();
        if (customerAnswerForPaymentMethod == 1) {
            OnlineOrderService orderService = new OnlineOrderService();
            registerService = orderService;
            paymentService = orderService;
        } else if (customerAnswerForPaymentMethod == 2) {
            OnSiteOrderService orderService = new OnSiteOrderService();
            registerService = orderService;
            paymentService = orderService;
        } else if (customerAnswerForPaymentMethod == 3) {
            PhoneOrderService orderService = new PhoneOrderService();
            registerService = orderService;
            paymentService = orderService;
        } else {
            System.out.println("Invalid Input!");
            return;
        }
        registerService.register(customerName);

        //Step3 : pay price
        System.out.println("Pay Price:");
        paymentService.payment(order.getTotalPrice());

        //Finally Print Bill
        System.out.println(order);


    }

}
