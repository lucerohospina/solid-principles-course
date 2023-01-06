package DIP;

// We create this factory to make it instantiate the SQLProductRepository

public class ProductFactory {
  
  public static ProductRepository create() {
    return new SQLProductRepository();
  }
}
