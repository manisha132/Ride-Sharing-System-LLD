package RideSharingSystem27Dec.Repository;

import RideSharingSystem27Dec.Model.Ride;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class RideRepository {
    private final Map<Long , Ride> rideMap = new HashMap<>();
    private AtomicLong rideIdGen = new AtomicLong(1L);

    public Ride save(Ride ride)
    {
        if(ride.getRideId()==null)
        {
           ride.setRideId(rideIdGen.getAndIncrement());
        }
        rideMap.put(ride.getRideId(), ride);
        return ride;
    }

    public Ride findById(Long rideId) {
        return rideMap.get(rideId);
    }
}
