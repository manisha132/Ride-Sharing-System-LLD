package RideSharingSystem27Dec.FARECALCULATION;

import RideSharingSystem27Dec.Model.Passenger;

public interface PaymentStrategy {
    void pay(Passenger passenger ,double amount);
}
