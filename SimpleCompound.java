import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
import java.util .*;
import java.math.*;

public class SimpleCompound extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(10);  
    TextField t2 = new TextField(10);  
    TextField t3 = new TextField(10);  
    TextField t4 = new TextField(10);  
    TextField t5 = new TextField(10);  
    Label l1 = new Label("Enter the amount:");  
    Label l2 = new Label("Enter the No.of years:");  
    Label l3 = new Label("Enter the Rate of  interest"); 
    
    Label l4 = new Label("Simple Interest="); 
    Label l5 = new Label("Compound Interest="); 
    Button c = new Button("Calculate");  
    public void init()  
    {  
        t1.setForeground(Color.black);  
        add(l1);  
        add(t1);
        add(l2);  
        add(t2);  
        add(l3);  
        add(t3);  
        add(c);  

        add(l4);  
        add(t4); 

        add(l5);  
        add(t5); 
        add(c);  
        c.addActionListener(this);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == c)  
        {  
            double pr = Double.parseDouble(t1.getText());  
            double t = Double.parseDouble(t2.getText());  
            double rate = Double.parseDouble(t3.getText());  
            double sim= ((pr * t * rate)/100);
            double com=(pr * Math.pow((1.0+rate/100.0),t))-pr;
            t4.setText(" " + sim);  
            t5.setText(" " + com);  
        }  
    }  
} 

<!-- <html>
<body>
    <applet code="SimpleCompound.class" width=500 height=200>
    </applet>
</body>
</html> -->
