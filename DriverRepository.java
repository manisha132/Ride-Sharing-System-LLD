package RideSharingSystem27Dec.Repository;

import RideSharingSystem27Dec.Model.Driver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverRepository {
    private final Map<Long, Driver> driverMap = new HashMap<>();

    public List<Driver> findAvailableDriver()
    {
        return driverMap.values().stream().filter(i-> i.isOnline()).toList();
    }

    public Driver save(Driver driver)
    {
        driverMap.put(driver.getDriverId(), driver);
       return driver;
    }
}
