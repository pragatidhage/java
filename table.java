
import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class table extends Applet
{
    public  void TableExample()
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
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
       
        
    }
     
    public void init()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableExample();
            }
        });
    }   
}
/*<html>
<head>
  <title>computer engineering</title>
</head>
<body>
  <h3>My first Java applet says:</h3>
  <applet code="table.class" width="300" height="300"
          alt="Error loading applet!">
  </applet>
</body>
</html>*/

/*<applet code="table.class" width="300" height="300"> 
</applet> 
*/