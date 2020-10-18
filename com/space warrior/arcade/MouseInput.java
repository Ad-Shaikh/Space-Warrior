package com.sk_hammad.arcade;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
    public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		
	  int mx=e.getX();
	  int my=e.getY();
	  /*
	    public  Rectangle pButton = new Rectangle(260,200,100,50);
	    public  Rectangle hButton = new Rectangle(260,270,100,50);
	    public  Rectangle qButton = new Rectangle(260,340,100,50);
      */
      	if(mx>=260 && mx<=360)
	    {
      		if(my>=200 && my<=250)
	        Game_1.State=Game_1.STATE.GAME;
	    }
      	if(mx>=260 && mx<=360)
	    {
      		if(my>=300 && my<=350)
	        System.exit(1);
	    }
	}
	public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
