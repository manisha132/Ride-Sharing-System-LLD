package RideSharingSystem27Dec.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private Long driverId;
    private String name;
    private String location;
    private boolean isOnline = true;


    public Driver(long l, String name, String s) {
        this.driverId =l;
        this.name = name;
        this.location = s;
    }
}
