package LSP.secondpattern;

public class InHouseProduct extends Product {

  // We add this override method that calls its own discount method
  @Override
  public double getDiscount() {
    this.applyExtraDiscount();
    return discount;
  }

  public void applyExtraDiscount() {
    discount = discount * 1.5;
  }
}
