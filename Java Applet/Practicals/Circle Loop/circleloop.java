import java.applet.*;
import java.awt.*;

public class circleloop extends Applet
{
    public void paint(Graphics g)
    {
		// Main Code 
		
		//Loop 
		
        for(int i=0; i<=4; i++)
        {
            g.drawOval(120,i*60+10,50,50);
        }
    }
}
/* <applet code="circleloop.class" height=500 width=500 ></applet> */