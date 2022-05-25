
import javax.swing.JFrame;
import javax.swing.JTable;
//19cm016 practical no 4 : write a program in java to create  a JTable
public class TableExample extends JFrame
{
    public static void main(String[] args)
    {
        //headers for the table
        String[] columns = new String[] {
            "Id", "Name", "current sem", "branch"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {01, "John",5 , "computer" },
            {05, "Rambo",4 , "electronics" },
            {06, "Zorro",3 , "IT" },
        };
        //create table with data
        JFrame S = new JFrame("computer engineering");
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
         S.add(table);
         S.setSize(400,400);
         S.setVisible(true);
         table.setVisible(true);
    }
     
    
   
}