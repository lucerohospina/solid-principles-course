package DIP;

import java.util.Arrays;
import java.util.List;

// We make this class implement the newly created ProductRepository
// public class SQLProductRepository {

public class SQLProductRepository implements ProductRepository {

  public List<String> getAllProductNames() {
    return Arrays.asList("soap", "toothpaste");
  }
}
