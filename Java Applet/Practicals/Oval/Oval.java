/* W.A.P to draw a line , a Rectangle & An Oval in Applet */

import java.applet.*;
import java.awt.*;

public class Oval extends Applet
{
	public void paint ( Graphics g)
	{
		// Main
		
		g.drawOval(20,30,50,70);
		g.fillOval(80,90,100,140);
		
		// Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of Oval",38,280);
	}
}

/*  <applet code ="Oval.class"  height=290 width=290> </applet> */