import javax.swing.*;
//19cm016 practical 1 : write a program in java to  demonstrate the use of Jlabel and ImageIcon , JTextField and JPasswordField
public class Swing{
public static void main(String args[])
{
JFrame a = new JFrame("Computer Engineering");
JLabel l1 , l2, l3 ;
l1 = new JLabel("label 1");
l2 = new JLabel("Label 2");
l3 = new JLabel("Label 3");
l1.setBounds(20,20,130,20);
l2.setBounds(20,100,130,20);
l3.setBounds(20,200,130,20);

JTextField j1 ;
j1 = new JTextField("this is text field....");
j1.setLayout(null);
j1.setSize(10, 20);
j1.setVisible(true);
j1.setBounds( 100, 20, 300, 20);

JPasswordField f1 = new JPasswordField();
f1.setSize(10, 20);
f1.setBounds( 100, 100, 300, 20);
a.add(l1);
a.add(l2);
a.add(l3);
a.add(j1);
a.add(f1);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
}