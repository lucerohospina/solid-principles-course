package DIP;

import java.util.List;

// DEPENDENCY INVERSION PRINCIPLE
// High-level modules should not depend on low-level modules. 
// Both should depend on abstractions.

// Abstractions should not depend on details. Details should depend on abstractions.

// A concept closely related:
// Inversion of control: IOC (Spring IOC Container)

public class ProductCatalog {
  private ProductRepository productRepository;

  public ProductCatalog(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void listAllProducts() {

    // We use the ProductFactory instead
    // SQLProductRepository sqlProductRepository = new SQLProductRepository();

    // List<String> allProductNames = sqlProductRepository.getAllProductNames();

    // we will invoke the factory method and get the object

    ProductRepository productRepository = ProductFactory.create();

    List <String> allProductNames = productRepository.getAllProductNames();

    System.out.println(allProductNames);
  }
}
