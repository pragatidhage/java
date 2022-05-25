import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.*;
public class Button extends Applet {
public void init(){
JButton b = new JButton("click me");
b.setBounds(40,90,85,20);
add(b);
}
}
/*<html>
<head>
  <title>Hello-World Applet</title>
</head>
<body>
  <h3>My first Java applet says:</h3>
  <applet code="Button.class" width="300" height="300"
          alt="Error loading applet!">
  </applet>
</body>
</html>*/

/*<applet code="Button.class" width="300" height="300"> 
</applet> 
*/