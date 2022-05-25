import javax.swing.*;
public class combobox{
 public static void main(String args[])
 { 
    String language[]={"English","Marathi","Hindi","Sanskrit"}; 
    JFrame F = new JFrame("languages") ;
    Scrollpane S = new Scrollpane("language");
    JComboBox b = new JComboBox(language) ;
      
    F.add(S);
    S.add(b) ;
    //F.setLayout( new Flowlayout());
    F.setSize(500,500);
    F.setVisible(true);
    b.setBounds(50, 50,90,20);  
 }  
}