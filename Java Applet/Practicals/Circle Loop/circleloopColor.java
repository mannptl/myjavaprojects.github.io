import java.applet.*;
import java.awt.*;

public class circleloopColor extends Applet
{
    public void paint(Graphics g)
    {
		
		// Main // Loop
		
        for(int i=0; i<=4; i++)
        {
			
			// Conditional Statement
			
            if(i%2!=0)
            {
                g.drawOval(120,i*60+10,50,50);
            }
            else
            {
                g.fillOval(120,i*60+10,50,50);
            }
            
        }
    }
}
/*  <applet code="circleloopColor.class" height=500 width=500 ></applet>  */