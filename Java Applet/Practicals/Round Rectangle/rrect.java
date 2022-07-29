/* W.A.P to draw a line , a Rectangle & An Oval in Applet */

import java.applet.*;
import java.awt.*;

public class rrect extends Applet
{
	public void paint ( Graphics g)
	{
		// Main
		
		 g.drawRoundRect(10,10,100,50,30,20);
		 g.fillRect(200,200,90,60,30,20);
		 
		 // Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of Round Rectangle",38,280);
	}
}

/*  <applet code ="rrect.class"  height=290 width=290> </applet> */