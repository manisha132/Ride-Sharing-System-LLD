package RideSharingSystem27Dec.Repository;

import RideSharingSystem27Dec.Model.Passenger;

import java.util.HashMap;
import java.util.Map;

public class PassengerRepository {
    private final Map<Long , Passenger> passengerMap = new HashMap<>();

    public Passenger save(Passenger passenger)
    {
        passengerMap.put(passenger.getPassengerId(),passenger);
        return passenger;
    }
    public Passenger findById(Long passengerId)
    {
        return passengerMap.get(passengerId);
    }

}
