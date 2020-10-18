package com.sk_hammad.arcade.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;

import com.sk_hammad.arcade.GlobalPosition;
import com.sk_hammad.arcade.input.Controller;

public class Enemy extends GlobalPosition{
	int count=7,i=1;
	Random r = new Random();
    double sp=r.nextInt(3)+2;
	Controller c;
	private String enemy="/images/enemy.png"; 
	public Enemy(int x, int y) {
		super(x, y);
	}
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getEnemyImage(), x, y, null);
	    g2d.draw(getBounds());
	}
	public void update()
	{
		y+=sp;
		if(y>480)
		{
			System.out.println("DODGES:"+count*i);
			x=r.nextInt(640);
			y=0;
		    sp=r.nextInt(3)+2;
		    i++;
		}
	}	
	public Rectangle getBounds()
	{
		return new Rectangle(x,y,30,30);
	}
	public Image getEnemyImage()
	{
		ImageIcon i =new ImageIcon(getClass().getResource(enemy));
		return i.getImage();
	}
}
