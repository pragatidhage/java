import mypack.PieChart;
import java.io.*;
public class PieChart_test {
public static void main(String args[])
	{  
         
         PieChart p = new PieChart(); // object is created
         p.setData(0,20);
         p.setData(1,63);
         p.setData(2,86);
         p.setData(3,55); // setting value to the object
         System.out.println(p.getData(0));
         System.out.println(p.getData(1));
         System.out.println(p.getData(2));
         System.out.println(p.getData(3));
	}
}
