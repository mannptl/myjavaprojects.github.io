import java.applet.*;
import java.awt.*;

public class colormatrixcircle extends Applet
{
    public void paint(Graphics g)
    {
		// Declaration
		
		 int f=1;
		 
		// Main // Loop
		
        for(int i=0; i<=2; i++)
        {
			for(int j=0; j<=2; j++)
			{
				if(f==0)
				{
					g.setColor(Color.blue);
					g.fillOval(i*60+10,j*60+10,50,50);
					f=1;
				}
				else
				{
					g.setColor(Color.green);
					g.fillOval(i*60+10,j*60+10,50,50);
					f=0;
				}
			}
        }
    }
}
/*  <applet code="colormatrixcircle.class" height=500 width=500 ></applet>  */