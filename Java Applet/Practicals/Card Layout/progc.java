import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class progc extends JFrame implements ActionListener{

    CardLayout card;
    JButton b1,b2,b3;
    Container c;

    progc()
    {
        c = getContentPane();
        card = new CardLayout(40,30);
        c.setLayout(card);

        b1 = new JButton("Apple");    
        b2 = new JButton("Boy");    
        b3 = new JButton("Cat");

        b1.addActionListener(this);    
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);
    }

    public void actionPerformed(ActionEvent e)   
    {
        card.next(c);    
    }

    public static void main(String argvs[])   
    {
        progc crdl = new progc();   
            
        crdl.setSize(300, 300);    
        crdl.setVisible(true);    
        crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}