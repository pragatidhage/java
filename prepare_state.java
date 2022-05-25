import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;  
import java.util.*;
class prepare_state{ 
    public prepare_state(){}
   
 
 public static void main(String args[])throws Exception{ 
    var a = new prepare_state();  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/employee_data","root",""); 
PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");  
  
 
 try{
do{  
System.out.println("enter no:");  
int no=Integer.parseInt(br.readLine());  
System.out.println("enter name:");  
String name=br.readLine();  
System.out.println("enter age:");  
int age =Integer.parseInt(br.readLine());
System.out.println("enter salary:");  
int salary=Integer.parseInt(br.readLine());  
  
ps.setInt(1,no);  
ps.setString(2,name);
ps.setInt(3,age);   
ps.setFloat(4,salary);  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");
} 
while(true);
   } 
catch(Exception e){
System.out.println("Duplicate entry");  
}
do{
System.out.println("Do you want to continue: y/n"); 

a. prepare_state();
String s=br.readLine();  
if(s.startsWith("n")){  
break;  
}  
}
while(true);
  

  

}}  