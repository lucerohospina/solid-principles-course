import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

// COULPING
// is defined as the level of inter dependency between various software components
// Loose couplig help attain better adherence to the Single Reponsibility Principle

public class Student {
  private String studentId;
  private Date studentDOB;
  private String address;

  // LET'S MOVE THIS INTO ITS OWN REPOSITORY CLASS AND REFER THE REPOSITORY IN THIS STUDENT CLASS
  // public void save() {
  //   // serialize object into a string representation
  //   String objectStr = MyUtils.serializeIntoAString(this);
  //   Connection connection = null;
  //   Statement stmt = null;

  //   try {
  //     Class.forName("com.mysql.jdbc.Driver");
  //     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
  //     stmt = connection.createStatement();
  //     stmt.execute("INSERT INTO STUDENTS VALUES (" + objectStr + ")");
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //   }
  // }

  // REFER THE REPOSITORY IN THIS CLASS
  public void save() {
    new Studentrepository().save(this);
  }
  
  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }
}

// Responsibility: Handle core students profile data
