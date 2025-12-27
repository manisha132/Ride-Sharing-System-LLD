package RideSharingSystem27Dec.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    private Long passengerId;
    private String name;
    private double walletBalance;

}
