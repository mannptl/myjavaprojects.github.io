/* Calculator in Applet */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends Applet implements ActionListener
{
    // Button
	
	Button b1=new Button("ADD");
	
	// Text Field
	
	TextField t1=new TextField(100);
	TextField t2=new TextField(100);
	TextField t3=new TextField(100);
	
	// Main
	
	public void init()
	{
		
		t1.setText("");
		t2.setText("");
		t3.setText("");
		
		
		add(t1);
		add(t2);
		add(b1);
		add(t3);
		
		b1.addActionListener(this);
	
	
	}
	
	// Sub Main
	
	public void actionPerformed(ActionEvent e)
	{
		int v1=Integer.parseInt(t1.getText());
		int v2=Integer.parseInt(t2.getText());
		t3.setText(String.valueOf(v1+v2))
	}
	


}

/*  <applet code ="Calc.class"  height=500 width=500> </applet> */