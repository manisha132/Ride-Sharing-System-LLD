package RideSharingSystem27Dec.FARECALCULATION;

import RideSharingSystem27Dec.Model.Passenger;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(Passenger passenger, double amount) {
        System.out.println("Cash payment collected: " + amount);
    }
}
