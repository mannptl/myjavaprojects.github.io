/* Build an applet that displays a horizontal rectangle in its center. Let the rectangle fill with color from left to right. */
import java.applet.*;
import java.awt.*;

public class  hrectangle extends Applet
{
	public void paint ( Graphics g)
	{
	  	// Main Code 
		
		g.setColor(Color.green);
		g.fillRect(50,50,400,200);
		
	}
}

/*  <applet code ="hrectangle.class"  height=300 width=500> </applet> */