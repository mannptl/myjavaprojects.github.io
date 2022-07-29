/* Wap to demonstrate the use of flow layout Manager */

import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;

public class prog
{
	JFrame f;
	
	prog()
	{
		f=new JFrame();
		
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main (String[] args)
	{
		new prog();
	}
}
