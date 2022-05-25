import java.sql.*;
/* 19cm016 //Practical 13- Write a Program to display the data from database using JDBC */  
class Conn_Employee{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/Employee_data","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from employee");  
while(rs.next())  
System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" ");
con.close();  
}catch(Exception e){ System.out.println(e);}  
}

  
}  