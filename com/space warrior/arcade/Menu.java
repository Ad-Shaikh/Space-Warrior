package com.sk_hammad.arcade;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {
	public  Rectangle pButton = new Rectangle(260,200,100,50);
	public  Rectangle qButton = new Rectangle(260,300,100,50);
	
	public void draw(Graphics2D g2d)
	{
		Font f0 = new Font("Arial",Font.BOLD,50);
		g2d.setFont(f0);
		g2d.setColor(Color.white);
	    g2d.drawString("THE SPACE WARRIOR",45,150);
	    Font f1 = new Font("Arial",Font.BOLD,30);
	    g2d.setFont(f1);
	    g2d.drawString("Play",pButton.x+19,pButton.y+35);
	    g2d.draw(pButton);
	    g2d.drawString("Quit",qButton.x+19,qButton.y+35);
	    g2d.draw(qButton);
	}
}
