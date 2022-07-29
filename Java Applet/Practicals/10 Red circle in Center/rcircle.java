
/* Draw 10 red circles in vertical in the center of applet */

import java.applet.*;
import java.awt.*;

public class rcircle extends Applet
{
	public void paint ( Graphics g)
	{
	  	// Main Code 
		
		for(int i=0; i<=10;  i++)
		{
			g.setColor(Color.red);
			g.fillOval(120,i*60+10,50,50);
		}
		
	}
}

/*  <applet code ="rcircle.class"  height=600 width=290> </applet> */