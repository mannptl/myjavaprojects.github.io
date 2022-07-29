/* W.A.P to draw a line , a Rectangle & An Oval in Applet */

import java.applet.*;
import java.awt.*;

public class Rect extends Applet
{
	public void paint ( Graphics g)
	{
		// Main
		
		g.drawRect(10,10,100,50);
		g.fillRect(200,200,90,60);  
		
		// Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of Rectangle",38,280);
	}
}

/*  <applet code ="Rect.class"  height=290 width=290> </applet> */