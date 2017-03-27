/**
 * Created by Luis Loja on 3/25/2017.
 */
//Demonstrate Choice lists.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
    <applet code="ChoiceDemo" with=300 height=180>
    </applet>
 */
public class ChoiceDemo extends Applet implements ItemListener{
    Choice os, browser;
    String msg="";

    public void init(){
        os=new Choice ();
        browser=new Choice();
        //add items to os list
        os.add("Windows");  //adds different choices to os list
        os.add("Andoroid");
        os.add("Solaris");
        os.add("Mac OS");
        //add items to browser list
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");
        //add choice lists to window
        add(os);
        add(browser);
        //register to receive item events
        os.addItemListener(this);
        browser.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        repaint();

    }

    //Display current selections.
    public void paint(Graphics g){ //uses the graphics to create the different sections
        msg="Current OS: ";
        msg += os.getSelectedItem();
        g.drawString(msg,6, 120);
        msg="Current Browser: ";
        msg +=browser.getSelectedItem();
        g.drawString(msg, 6, 140);

    }

}

