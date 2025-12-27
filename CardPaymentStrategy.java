package RideSharingSystem27Dec.FARECALCULATION;

import RideSharingSystem27Dec.Model.Passenger;

public class CardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(Passenger passenger, double amount) {
        System.out.println("Card payment collected: " + amount);
    }
}
