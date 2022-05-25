
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Appletpr7 extends Frame implements MouseListener, MouseMotionListener 
{
   static JLabel message = new JLabel();
    static JFrame f = new JFrame("mouse Events");
   Appletpr7() 
   {
      
   }
   public static void main(String[] args){

       
     message.setBounds(100,100,300,20);
     Appletpr7 a = new Appletpr7();
     
      f.add(message);
      f.addMouseListener(a);
      f.addMouseMotionListener(a);
      f.setSize(500,500);  
      f.setLayout(null);  
      f.setVisible(true);
   }
 
   
 
   public void mouseEntered(MouseEvent me) 
   {
      
      message.setText("Mouse Entered: (" + me.getX() + ", " + me.getY() + ")");
     
   }
 
   public void mouseExited(MouseEvent me) 
   {
      
      message.setText("Mouse Exited: (" + me.getX() + ", " + me.getY() + ")");
    
   }
 
   public void mouseClicked(MouseEvent me) 
   {
      
      message.setText("Mouse Clicked: (" + me.getX() + ", " + me.getY() + ")");
      
   }
 
   public void mousePressed(MouseEvent me) 
   {
    
      message.setText("Mouse Pressed: (" + me.getX() + ", " + me.getY() + ")");

   }
 
   public void mouseReleased(MouseEvent me) 
   {
     
      message.setText("Mouse Released: (" + me.getX() + ", " + me.getY() + ")");
     
   }
 
   public void mouseMoved(MouseEvent me) 
   {
      
      message.setText("Mouse Moved: (" + me.getX() + ", " + me.getY() + ")");
     
   }
 
   public void mouseDragged(MouseEvent me) 
   {
      
      message.setText("Mouse Dragged: (" + me.getX() + ", " + me.getY() + ")");
     
   }
}