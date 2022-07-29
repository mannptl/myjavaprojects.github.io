/* Write a program which demonstrate the use of buttons.*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class btnapp extends Applet implements ActionListener
{
    String msg="";
    Button yes,no,maybe;

    public void init()
    {
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("May be");

        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    
    }

    @Override

    public void actionPerformed(ActionEvent arg0)
    {
        String str = arg0.getActionCommand();
        if(str.equals("Yes"))
        {
            msg = "You have pressed Yes Button";
        }
        else if(str.equals("No"))
        {
            msg = "You have pressed No Button";
        }
        else
        {
            msg = "You have pressed May be Button";
        }
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, 6, 100);
    }
}

/* <applet code="btnapp.class" height=500 width=500 ></applet> */