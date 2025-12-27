package RideSharingSystem27Dec.FARECALCULATION;

public class RegularFareStrategy implements FareStrategy{
    @Override
    public double calculationFare() {
        return 100.0;
    }
}
