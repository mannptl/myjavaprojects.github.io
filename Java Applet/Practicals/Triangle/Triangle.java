/* W.A.P to draw a line , a Rectangle & An Oval in Applet */

import java.applet.*;
import java.awt.*;

public class Triangle extends Applet
{
	public void paint ( Graphics g)
	{
		// Main
		
		g.drawLine(100,50,50,100);
		g.drawLine(100,50,150,100);
		g.drawLine(50,100,150,100);
		
		// Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of Triangle",38,280);

	}
}

/*  <applet code ="Triangle.class"  height=290 width=290> </applet> */