import java.sql;
import java.util.*;

public class sample{
String dbURL = "jdbc:mysql://localhost:3306/sampledb";
String username = "root";
String password = "root";
int case ;
 
try {
 
    Connection conn = DriverManager.getConnection(dbURL, username, password);
 
    if (conn != null) {
        System.out.println("Connected");
    }
} catch (SQLException ex) {
}

String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
 
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1, "bill");
statement.setString(2, "secretpass");
statement.setString(3, "Bill Gates");
statement.setString(4, "bill.gates@microsoft.com");
 
int rowsInserted = statement.executeUpdate();
if (rowsInserted > 0) {
    System.out.println("A new user was inserted successfully!");
}


}