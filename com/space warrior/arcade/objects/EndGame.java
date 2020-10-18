package com.sk_hammad.arcade.objects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class EndGame {


	public void paint(Graphics g)
	{
		Font f = new Font("Arial",Font.BOLD,50);
		g.setFont(f);
		g.setColor(Color.white);
	    g.drawString("YOU ARE DEAD!",45,200);
	}
}
