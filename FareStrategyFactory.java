package RideSharingSystem27Dec.FARECALCULATION;

import RideSharingSystem27Dec.Model.RideType;

public class FareStrategyFactory {
    public static FareStrategy getStrategy(RideType type)
    {
        return switch(type)
        {
            case Regular -> new RegularFareStrategy();
            case Premium -> new PremiumFareStrategy();
        };
    }

}
