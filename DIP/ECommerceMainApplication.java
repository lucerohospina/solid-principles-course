package DIP;

public class ECommerceMainApplication {
  public static void main(String[] args) {

    ProductRepository productRepository = new ProductFactory().create();
    ProductCatalog productCatalog = new ProductCatalog(productRepository);

    productCatalog.listAllProducts();
  }
}
