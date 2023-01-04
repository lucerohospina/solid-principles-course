package LSP.firstpattern;

import java.util.ArrayList;
import java.util.List;

public class VehicleUtils {
  public static void main(String[] args) {
    System.out.println("MAIN INIT");

    Vehicle first = new Car();
    Vehicle second = new Car();
    Vehicle third = new RacingCar();

    List<Vehicle> myVehicles = new ArrayList<>();

    myVehicles.add(first);
    myVehicles.add(second);
    myVehicles.add(third);

    for(Vehicle vehicles: myVehicles) {
      System.out.println(vehicles.getInteriorWidth());
    }
  }
}
