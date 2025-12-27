package RideSharingSystem27Dec;

import RideSharingSystem27Dec.Model.*;
import RideSharingSystem27Dec.Repository.DriverRepository;
import RideSharingSystem27Dec.Repository.PassengerRepository;
import RideSharingSystem27Dec.Repository.RideRepository;
import RideSharingSystem27Dec.Service.RideMatchingService;
import RideSharingSystem27Dec.Service.RideService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RideSharingSystem27DecApplication {

	public static void main(String[] args) {
//		SpringApplication.run(RideSharingSystem27DecApplication.class, args);
        PassengerRepository passengerRepo = new PassengerRepository();
        DriverRepository driverRepo = new DriverRepository();
        RideRepository rideRepo = new RideRepository();
        RideMatchingService matchingService = new RideMatchingService();
        passengerRepo.save(new Passenger(1L, "Alice", 500));
        driverRepo.save(new Driver(1L, "Bob", "Area-A"));
        RideService rideService =
                new RideService(rideRepo, driverRepo, passengerRepo,matchingService);

        Ride ride = rideService.requestRide(
                1L, "Mall", "Airport", RideType.Premium
        );

        rideService.completeRide(ride.getRideId(), PaymentMethod.Wallet);
        System.out.println("Ride Completed. Fare: " + ride.getFare());


    }

}
