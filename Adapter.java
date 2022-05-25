import java.awt.*;  
import java.awt.event.*;
import javax.swing.*; 
public class WAdapter extends WindowAdapter{
    JFrame f = new JFrame ("WindowAdapter");
    JTextField l = new JTextField("no event");
    JTextField l1 = new JTextField();
    WAdapter(){
        
        l.setBounds(100,100,150,20);
        l1.setBounds(100,130,150,20);
        f.addWindowListener(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible (true); 
        f.addWindowFocusListener(this);
        f.add(l);f.add(l1);
    }
    public void windowActivated(WindowEvent we)
    {
        l.setText("Window Activated");
    }
    public void windowDeactivated(WindowEvent we)
    {
        l.setText("Window Deactivated");
    }
    public void windowGainedFocus(WindowEvent we)
    {
        l1.setText("Window gained focus");
    }
    public void windowLostFocus(WindowEvent we)
    {
        l1.setText("Window lost focus");
    }
    

    public static void main(String[] args) {
        new WAdapter();
    }

}