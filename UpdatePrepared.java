import java.sql.*;
import java.io.*;
/* 19cm016 //Practical 15-Write a Program to Update and Delete record from a Database Table*/
class UpdatePrepared{
public static void main(String args[]){
try{
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/employee_data","root",""); 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

PreparedStatement ps=con.prepareStatement("update employee set name=? ,age=?,salary=? where  no=?");
  


     System.out.println("enter no which u want to update:");  
     int no=Integer.parseInt(br.readLine()); 
    System.out.println("enter name:");  
    String name=br.readLine();  
    System.out.println("enter age:");  
    int age =Integer.parseInt(br.readLine());
    System.out.println("enter salary:");  
    int salary=Integer.parseInt(br.readLine());  
      
   

    ps.setString(1,name);
    ps.setInt(2,age);   
    ps.setInt(3,salary);  
    ps.setInt(4,no);
    int i=ps.executeUpdate();  
    System.out.println(i+" records affected");
    con.close();

}catch(Exception e){ System.out.println(e);}

}
}