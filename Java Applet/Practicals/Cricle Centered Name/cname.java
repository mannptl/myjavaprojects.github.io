import java.applet.*;
import java.awt.*;

public class  cname extends Applet
{
	public void paint ( Graphics g)
	{
		// Border
		
		g.setColor(Color.green);
		g.drawRect(15,15,472,278);
		g.fillRect(15,15,472,278);
		
	  	// Main Code 
		
		// g.drawOval(150,50,200,200);
		g.setColor(Color.blue);
		g.fillOval(150,50,200,200);
		
		
		// Sentence Display
		
		g.setColor(Color.white);
		g.drawString(" Mann Patel ",219,150);
	}
}

/*  <applet code ="cname.class"  height=300 width=500> </applet> */