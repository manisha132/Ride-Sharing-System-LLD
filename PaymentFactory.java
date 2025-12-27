package RideSharingSystem27Dec.FARECALCULATION;

import RideSharingSystem27Dec.Model.PaymentMethod;

public class PaymentFactory {
    public static PaymentStrategy getStrategy (PaymentMethod paymentMethod)
    {
        return switch(paymentMethod)
        {
            case Cash -> new CashPaymentStrategy();
            case Card -> new CardPaymentStrategy();
            case Wallet -> new WalletPaymentStrategy();
        };
    }
}
