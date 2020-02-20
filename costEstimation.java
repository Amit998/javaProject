import java.applet.Applet;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
import java.awt.event.*; 

 
public class costEstimation extends Applet implements ItemListener,ActionListener{
 
	List list = null;
	double cost;
	TextField t1,t2;
	
	Label l1,l2,l3,l4;
	Button c;
	
	public void init(){
		
	
		list = new List(5, false);
		
		l1 = new Label("Your Cost Will Be      INR Per Squre feet           ");  

		l2=new Label("Enter The Total Area Of The House in squre feet :");
		t1 = new TextField(10);  
		c= new Button("Estimate The value");  
		l3=new Label("your Total Cost For The House Will be :     ");
		l4=new Label("Please Select Type Of The materials");
		list.add(" standard materials ");
		list.add(" above standard materials ");
		list.add(" high standard material ");
		list.add(" high standard material and fully automated home ");
	
		
		add(l4);
		add(list);
		

		list.addItemListener(this);
		
		add(l1);
		add(l2);
		add(t1);
		add(c);
		add(l3);
		c.addActionListener(this);  
	}
	
	public void paint(Graphics g){
	
		
		
		if(list.getSelectedIndex()==0)
		{
			cost=1200 ;
			l1.setText("Your Cost Will Be: "+cost+"INR Per Squre feet ");
		}
		else if(list.getSelectedIndex()==1)
		{
			cost=1500;
			l1.setText("Your Cost Will Be: "+cost+"INR Per Squre feet ");
		}
		else if(list.getSelectedIndex()==2)
		{
			cost=1800;
			l1.setText("Your Cost Will Be: "+cost+"INR Per Squre feet ");
		}
		else if(list.getSelectedIndex()==3)
		{
			cost=2500;
			l1.setText("Your Cost Will Be: "+cost+"INR Per Squre feet ");
		}
	}
	public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == c)  
        {  
			double sqft = Double.parseDouble(t1.getText()); 
			double tc=cost*sqft;
			

            l3.setText("You Selected "+list.getSelectedItem()+ " Which Was Cost "+cost+"INR per Squre Feet " +"And You Want The Aera Of "+sqft+"Squre feet So The total cost Will be "+ tc+"INR Thank you ");
        }  
    } 
	
 
	public void itemStateChanged(ItemEvent arg0) {
		repaint();	
	}

 
}
// <html>
// <body>
//     <applet code="costEstimation.class" width=500 height=200>
//     </applet>
// </body>
// </html>
