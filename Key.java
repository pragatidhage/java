import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;

/* 19cm016 practical no 2  Write a Program to demonstrate the status of key on Applet window such as
KeyPressed, KeyReleased, KeyUp, KeyDown*/
public class Key extends Frame implements KeyListener{
    JFrame f = new JFrame("key Event");
    JLabel l1,l2;
    JTextField b = new JTextField();
    Key(){
        l1 = new JLabel("no event");
        l1.setBounds(90,30,150,30);
        
        l2 = new JLabel("no event");
        l2.setBounds(90,70,150,30);
        b.setBounds(50,120,200,30);

        b.addKeyListener(this);
        f.add(l1);f.add(l2);f.add(b);
        f.setSize(350,300);  
        f.setLayout(null);  
        f.setVisible(true);
        
        
    }
    public static void main (String[] args) {
        
        Key k = new Key();

    }
    public void keyPressed(KeyEvent k)
    {
        l1.setText("key is Pressed");
    }
    public void keyReleased(KeyEvent k)
    {
       l1.setText("key is Released");
    }
 
    public void keyTyped(KeyEvent k)
    {
        l2.setText("key Typed is  "+ k.getKeyChar());
    }
 }

 