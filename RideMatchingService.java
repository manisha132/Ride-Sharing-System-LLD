package RideSharingSystem27Dec.Service;

import RideSharingSystem27Dec.Model.Driver;

import java.util.List;

public class RideMatchingService {
    public Driver matchDrive(List<Driver> driverList)
    {
        return driverList.isEmpty()?null:driverList.get(0);
    }
}
