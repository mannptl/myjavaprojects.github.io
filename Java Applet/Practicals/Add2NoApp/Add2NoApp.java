/* W.A.P to add two numbers by using Text Fields Component of an applet*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class  Add2NoApp extends Applet implements ActionListener
{
    // Button
	
	Button b1=new Button("ADD");
	 
	// Text Field
	
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	TextField t3=new TextField(10);
	
	// Main
	
	public void init()
	{
		
		t1.setText("0");
		t2.setText("0");
		t3.setText("0");
		
		
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
		t3.setText(String.valueOf(v1+v2));
	}
	

}

/*  <applet code ="Add2NoApp.class"  height=290 width=290> </applet> */