/*  W.A.P to create simple applet , entering message and print a message on a Applet*/

import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet
{
	public void paint ( Graphics g)
	{
		g.drawString("Welcome",150,150);
	}
}

/*  <applet code ="FirstApplet.class"  height=200 width=200> </applet> */