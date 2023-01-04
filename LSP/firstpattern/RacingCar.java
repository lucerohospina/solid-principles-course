package LSP.firstpattern;

public class RacingCar extends Vehicle {

   // from the racing car we actually need the cockpick width.
   // We are going to create a parent class Vehicle to be able to a getInteriorWidth method which will
   // call its correspondant method within Car and Racing Car

   // public double getCabinWidth() {
   //    return 5.0; // return cabin width
   // }

   @Override
   public double getInteriorWidth() {
    return this.getCockpitWidth();
   }

   public double getCockpitWidth() {
    return 7.0; // cockpit width
   }
}
