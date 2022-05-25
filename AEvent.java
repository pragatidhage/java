import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;  
/* 19cm016 practical 8 Write a Program to demonstrate the function of JLabel, JTextField and
JPasswordField Using Listener Interface.*/
class AEvent extends Frame implements ActionListener{  

            JFrame f = new JFrame("Login Form");
            JTextField tf;  
            JPasswordField  ps ;
            JLabel l1,l2,label;

            AEvent(){  
            
                    //create components  
                    tf=new JTextField();  
                    ps=new JPasswordField();
                    l1=new JLabel("username:");  
                    l2=new JLabel("password:");
                    label=new JLabel();  
                    tf.setBounds(130,50,170,20);
                    ps.setBounds(130,70,170,20);
                    l1.setBounds(30,50,100,20);
                    l2.setBounds(30,70,100,20);
                    label.setBounds(30,170,200,20);
                    JButton b =new JButton("login");


                    b.setBounds(100,120,80,30);  
                    
                    //register listener  
                    b.addActionListener(this);//passing current instance  
                    
                    //add components and set size, layout and visibility  
                    f.add(b);f.add(tf); f.add(ps) ; f.add(l1);f.add(l2);f.add(label);
                    f.setSize(350,300);  
                    f.setLayout(null);  
                    f.setVisible(true);  
            }  
            public void actionPerformed(ActionEvent e){  
                    String data = "Username " + tf.getText();  
                    data += ", Password: " + new String(ps.getPassword());   
                    label.setText(data);  
            }  
            public static void main(String args[]){  
                    new AEvent();  
            }  
}