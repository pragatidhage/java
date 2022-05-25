import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//19cm016 practical no 2 : write a program using swing  to display a scrollpane and Jcombobox in an applet with the items :- english, marathi,hindi,and sanskrit
public class Jscrollpane 
{

    public static void main(String[] args)
     {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JScrollPane scrollPane = new JScrollPane();
        String language[]={"English","Marathi","Hindi","Sanskrit"}; 
        JComboBox b = new JComboBox(language) ;
        
        panel.add(scrollPane);
        panel.add(b);
        frame.setContentPane(panel);
        frame.setSize(500, 500);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
   }
}