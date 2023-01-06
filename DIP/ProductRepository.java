package DIP;

import java.util.List;


// We create this interface to avoid dependency bt SQLProductRepository and ProductCatalog

public interface ProductRepository {
  public List<String> getAllProductNames();
}
