/* W.A.P to draw a line , a Rectangle & An Oval in Applet */

import java.applet.*;
import java.awt.*;

public class Line extends Applet
{
	public void paint ( Graphics g)
	{
		// Main
		
		g.drawLine(50,70,80,90);
		
		// Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of Simple Line",38,280);
	}
}

/*  <applet code ="Line.class"  height=290 width=290> </applet> */