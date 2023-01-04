package LSP.firstpattern;

// LISKOV SUBSTITUTION PRINCIPLE
// Objects shoud be replaceable with their subtypes without affecting the correctness of the program
// INHERITANCE: The 'Is-A' way of thinking (extends from ...)
// Liskov pattern: 1) Breaking the hierarchy if it fails the substitution test
// 2) Tell, don't ask (see the Product examples in secondpattern folder)

public class Car extends Vehicle {

  @Override
  public double getInteriorWidth() {
    return this.getCabinWidth();
  }

  public double getCabinWidth() {
    return 20.0; // cabin width
  }
}
