package RideSharingSystem27Dec.FARECALCULATION;

import RideSharingSystem27Dec.Model.Passenger;

public class WalletPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(Passenger passenger, double amount) {
        if (passenger.getWalletBalance() < amount) {
            throw new RuntimeException("Insufficient wallet balance");
        }
        passenger.setWalletBalance(passenger.getWalletBalance()-amount);
    }
}
