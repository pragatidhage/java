
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/* 19cm016 practical no 7 Write a Program to demonstrate the various Mouse events using MouseListener
and MouseMotionListener Interface*/
class Mouse extends Frame implements MouseMotionListener , MouseListener {

  static JLabel l1,l2,label1, label2, label3,label4, label5, label6, label7;
  // default constructor
	Mouse()
	{
	}
  public static void main(String[] args)
	{
        JFrame f = new JFrame("MouseMotionListener");
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        l1 = new JLabel("MouseMotionListener:- ");
        l1.setBounds(10, 20, 400, 14);

        l2 = new JLabel("MouseListener:- ");
        l2.setBounds(10, 80, 400, 14);

        label1 = new JLabel("no event ");
        label1.setBounds(10, 40, 400, 14);
        
        label2 = new JLabel("no event ");
        label2.setBounds(10, 60, 400, 14);
       
        label3 = new JLabel("no event ");
        label3.setBounds(10, 100, 400, 14);

        label4 = new JLabel("no event ");
        label4.setBounds(10, 120, 400, 14);

        label5 = new JLabel("no event ");
        label5.setBounds(10, 140, 400, 14);

        label6 = new JLabel("no event ");
        label6.setBounds(10, 160, 400, 14);

        label7 = new JLabel("no event ");
        label7.setBounds(10, 180, 400, 14);
       
        Mouse m = new Mouse();
        f.addMouseMotionListener(m);
        f.addMouseListener(m);
        f.add(l1);
        f.add(label1);
        f.add(label2);
        f.add(l2);
        f.add(label3);
        f.add(label4);
        f.add(label5);
        f.add(label6);
        f.add(label7);
        
        f.show();
	}
	public void mouseDragged(MouseEvent e)
	{
		
        label1.setText("mouse is dragged through point "+ e.getX() + " " + e.getY());
	}	
	public void mouseMoved(MouseEvent e)
	{
		
		label2.setText("mouse is moved to point "+ e.getX() + " " + e.getY());
	}	
    public void mouseClicked(MouseEvent e)
    {
        
        label3.setText("mouse is clicked at "+ e.getX() + " " + e.getY()+"  "+ e.getClickCount());
    }

   
    public void mousePressed(MouseEvent e) {
        label4.setText("mouse is pressed at "+ e.getX() + " " + e.getY());
   }

    
    public void mouseReleased(MouseEvent e) {
        label5.setText("mouse is released at "+ e.getX() + " " + e.getY());
    }

    
    public void mouseEntered(MouseEvent e) {
        label6.setText("mouse is entered from "+ e.getX() + " " + e.getY());
    }

    
    public void mouseExited(MouseEvent e) {
        label7.setText("mouse is exited at "+ e.getX() + " " + e.getY());
    }
}


		

		
		
		
		

		
		

		
	

	

	
	

	
	
