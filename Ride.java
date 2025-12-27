package RideSharingSystem27Dec.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ride {
    private Long rideId;
    private Long passengerId;
    private Long driverId;
    private String pickUp;
    private String destination;
    private RideType rideType;
    private RideStatus rideStatus;
    private double fare;

    public Ride(Long rideId, Long passengerId, Long driverId, String pickUp, String destination, RideType rideType, RideStatus rideStatus, double fare) {
        this.rideId = rideId;
        this.passengerId = passengerId;
        this.driverId = driverId;
        this.pickUp = pickUp;
        this.destination = destination;
        this.rideType = rideType;
        this.rideStatus = RideStatus.Requested;
        this.fare = fare;
    }

    public Ride(Long rideId, Long passengerId, String pickUp, String destination, RideType rideType) {
        this.rideId=rideId ;
        this.passengerId = passengerId;
        this.pickUp = pickUp;
        this.destination = destination;
        this.rideType = rideType;

    }
}
