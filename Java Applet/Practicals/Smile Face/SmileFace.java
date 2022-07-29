/* W.A.P to draw a Smile Face */

import java.applet.*;
import java.awt.*;

public class SmileFace extends Applet
{
	public void paint ( Graphics g)
	{
		// Main
		
		g.drawOval(80, 70, 150, 150);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
		g.drawArc(130, 180, 50, 20, 180, 180);
		
		// Sentence display
		
		g.setColor(Color.black);
		g.drawString("This is a Applet view of Smile Face",38,280);
		
	}
}

/*  <applet code ="SmileFace.class"  height=290 width=290> </applet> */