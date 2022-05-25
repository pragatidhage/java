import java.sql.*;
import java.io.*;
/* 19cm016 //Practical 15-Write a Program to Update and Delete record from a Database Table*/
class DeletePrepared{
public static void main(String args[]){
try{
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/employee_data","root",""); 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PreparedStatement stmt=con.prepareStatement("delete from employee where no=?");
System.out.println("enter no which u want to Delete:"); 
int no=Integer.parseInt(br.readLine()); 
stmt.setInt(1,no);

int i=stmt.executeUpdate();
System.out.println(i+" records deleted");

con.close();

}catch(Exception e){ System.out.println(e);}

}
}