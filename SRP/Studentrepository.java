import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Studentrepository {
  public void save(Student student) {
    // serialize object into a string representation
    String objectStr = MyUtils.serializeIntoAString(student);
    Connection connection = null;
    Statement stmt = null;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
      stmt = connection.createStatement();
      stmt.execute("INSERT INTO STUDENTS VALUES (" + objectStr + ")");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

// Responsibility: Handle database operations
