import java.sql.*;
class UP{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sonoo","root",""); 
PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");
stmt.setString(1,"Sonoo");//1 specifies the first parameter in the query i.e. name
stmt.setInt(2,1);

int i=stmt.executeUpdate();
System.out.println(i+" records updated");

con.close();

}catch(Exception e){ System.out.println(e);}

}
}