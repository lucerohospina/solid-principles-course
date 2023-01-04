package LSP.secondpattern;

import java.util.ArrayList;
import java.util.List;

// This is not a Liskov design, Its against the Liskocv principle
// We should've been able to deal with all objects as Product objects instead of InHouseProducts.
// Let's go and modify the InHouseProduct class.

// Tell, don't ask pattern

public class PricingUtils {
  public static void main(String[] args) {
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new InHouseProduct();

    List<Product> productList = new ArrayList<>();

    productList.add(p1);
    productList.add(p2);
    productList.add(p3);

    for (Product product: productList) {
      // No need to check if InHouseProduct
      // Utils class doesn't need to ask anything, instead It need to tell

      // if (product instanceof InHouseProduct) {
      //   ((InHouseProduct) product).applyExtraDiscount();
      // }

      System.out.println(product.getDiscount());
    }
  }
}
