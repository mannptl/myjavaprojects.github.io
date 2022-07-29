/* Wap to demonstrate the use of flow layout Manager */

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class progb
{
	JFrame f;
	
	progb()
	{
		f=new JFrame();
		
		JButton b1=new JButton("North");
		JButton b2=new JButton("South");
		JButton b3=new JButton("East");
		JButton b4=new JButton("West");
		JButton b5=new JButton("Center");
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main (String[] args)
	{
		new progb();
	}
}
