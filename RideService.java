package RideSharingSystem27Dec.Service;

import RideSharingSystem27Dec.FARECALCULATION.FareStrategy;
import RideSharingSystem27Dec.FARECALCULATION.FareStrategyFactory;
import RideSharingSystem27Dec.FARECALCULATION.PaymentFactory;
import RideSharingSystem27Dec.FARECALCULATION.PaymentStrategy;
import RideSharingSystem27Dec.Model.*;
import RideSharingSystem27Dec.Repository.DriverRepository;
import RideSharingSystem27Dec.Repository.PassengerRepository;
import RideSharingSystem27Dec.Repository.RideRepository;

public class RideService {
    private final RideRepository rideRepo;
    private final DriverRepository driverRepo;
    private final PassengerRepository passengerRepo;
    private final RideMatchingService matchingService;

    public RideService(RideRepository rideRepo, DriverRepository driverRepo, PassengerRepository passengerRepo, RideMatchingService matchingService) {
        this.rideRepo = rideRepo;
        this.driverRepo = driverRepo;
        this.passengerRepo = passengerRepo;
        this.matchingService = matchingService;
    }

    public Ride requestRide(Long passengerId, String pickUp , String destination , RideType rideType)
    {
        Ride ride = new Ride(null,passengerId,pickUp,destination,rideType);
        rideRepo.save(ride);
        Driver driver =matchingService.matchDrive(driverRepo.findAvailableDriver());
        if(driver!=null)
        {
            driver.setOnline(false);
            driver.setDriverId(driver.getDriverId());
            ride.setRideStatus(RideStatus.Accepted);
        }
        return ride;
    }
    public void completeRide(Long rideId, PaymentMethod paymentMethod)
    {
        Ride ride = rideRepo.findById(rideId);
        Passenger passenger = passengerRepo.findById(ride.getPassengerId());
        FareStrategy fareStrategy = FareStrategyFactory.getStrategy(ride.getRideType());
        double totalFare = fareStrategy.calculationFare();
        ride.setFare(totalFare);
        PaymentStrategy paymentStrategy = PaymentFactory.getStrategy(paymentMethod);
        paymentStrategy.pay(passenger,ride.getFare());
        ride.setRideStatus(RideStatus.Completed);

    }

}
