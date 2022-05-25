import java.sql.*;  
import java.io.*;  
/*19CM016 practical no 14:- Write a Program to insert the data into database by using PreparedStatement
Interface */
class RS{  
public static void main(String args[])throws Exception{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/employee_data","root","");
PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
do{  
System.out.println("enter no:");  
int no=Integer.parseInt(br.readLine());  
System.out.println("enter name:");  
String name=br.readLine();  
System.out.println("enter age:");  
int age=Integer.parseInt(br.readLine());  
System.out.println("enter salary:");  
Integer salary=Integer.parseInt(br.readLine());  
  
ps.setInt(1,no);  
ps.setString(2,name);  
ps.setInt(3,age);  
ps.setInt(4,salary);  
int i=ps.executeUpdate();  
System.out.println(i+" records affected"); 
  
System.out.println("Do you want to continue: y/n");  
String s=br.readLine();  
if(s.startsWith("n")){  
break;  
}  
}while(true);  
  
con.close();  
}}  