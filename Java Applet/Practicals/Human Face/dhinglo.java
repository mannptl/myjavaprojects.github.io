/* W.A.P to Make a Human Face*/

import java.applet.*;
import java.awt.*;

public class dhinglo extends Applet
{
	public void paint ( Graphics g)
	{
		//Face 
		g.setColor(Color.black);
		g.drawOval(30,30,200,200);
		g.setColor(Color.yellow);
        g.fillOval(31,33,199,197);
		
		//Eye 1
		
		g.setColor(Color.black);
		g.drawOval(73,90,40,25);
		g.setColor(Color.white);
		g.fillOval(74,93,39,22);
		
		//Kiki 1
	
		g.drawOval(86,95,15,15);
		g.setColor(Color.black);
		g.fillOval(87,98,14,12);
		
		//Eye 2
		
		g.drawOval(146,90,40,25);
		g.setColor(Color.white);
		g.fillOval(147,93,39,22);
		
		//Kiki 2
		
		g.drawOval(159,95,15,15);
		g.setColor(Color.black);
		g.fillOval(162,98,14,12);
		
		//EyeBrow 1
		g.drawArc(73,85,40,10,0,180);
		
		//EyeBrow 2
		g.drawArc(145,85,40,10,0,180);
		
		//Nose 
		
		g.drawLine(130,120,115,150);
		g.drawLine(130,120,145,150);		
		g.drawLine(115,150,145,150);
		
		//Mouth 
		
		//g.setColor(Color.black);
		//g.drawArc(95,130,70,80,0,-180);
		g.setColor(Color.pink);
		g.fillArc(96,131,71,81,0,-181);
		
		//Ear 1
		
		g.setColor(Color.black);
		g.drawOval(230,96,30,50);
		g.setColor(Color.yellow);
		g.fillOval(231,99,29,47);
		
		//Ear 2
		
		g.setColor(Color.black);
		g.drawOval(2,96,30,50);
		g.setColor(Color.yellow);
		g.fillOval(3,99,29,47);
		
		// Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of human Face",50,280);
		
	}
}

/*  <applet code ="dhinglo.class"  height=290 width=290> </applet> */