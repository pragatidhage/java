 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
 
public class Appletpr6 extends Frame implements KeyListener 
{ 
    static JTextField t1, t2, t3, t4;
    static JFrame f = new JFrame("Key Event") ;
    Appletpr6() 
    { 
       
    }  
    public static void main(String[] args){
         t1=new JTextField(20); 
         t1.setBounds(100,40,200,20);
        t2=new JTextField(70); 
        t2.setBounds(50,60,400,20);
        t3=new JTextField(70); 
        t3.setBounds(50,80,400,20);
        t4=new JTextField(70); 
        t4.setBounds(50,100,400,20);
            f.add(t1); 
            f.add(t2); 
            f.add(t3); 
            f.add(t4);
            f.setSize(500,500);
            f.setLayout(null) ;
            f.setVisible(true);
      Appletpr6 a = new Appletpr6();
      t1.addKeyListener(a); 
    }
    public void keyTyped(KeyEvent e) 
    { 
        t2.setText("key Released"+e.getKeyChar()); 
    }  
    public void keyReleased(KeyEvent e) 
    { 
        t3.setText("key Released"+e.getKeyChar()); 
    }  
    public void keyPressed(KeyEvent e) 
    { 
        int kc; 
        String s; 
        kc=e.getKeyCode(); 
        s=e.getKeyText(kc); 
        t4.setText("Key Pressed"+s); 
    } 
}