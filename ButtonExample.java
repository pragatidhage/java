import javax.swing.*;
public class ButtonExample{
public static void main(String args[])
{
JFrame a = new JFrame("Computer Engineering");
JButton b1;
JLabel l1;
b1 = new JButton("Click Me");
l1 = new JLabel("Label 1");
b1.setBounds(40,40,200,30);
l1.setBounds(20,20,150,20);
a.add(b1);
a.add(l1);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
}