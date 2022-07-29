/* W.A.P to draw a Eye */

import java.applet.*;
import java.awt.*;

public class Eye extends Applet
{
	public void paint ( Graphics g)
	{
		// Main
		
		g.fillOval(80, 70, 140, 70);
		g.setColor(Color.white);
        g.fillOval(130, 83, 45, 45);
		g.setColor(Color.black);
		
		// Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of Eye of Human",38,280);
	}
}

/*  <applet code ="Eye.class"  height=290 width=290> </applet> */