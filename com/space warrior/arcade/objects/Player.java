package com.sk_hammad.arcade.objects;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import com.sk_hammad.arcade.GlobalPosition;
import com.sk_hammad.arcade.input.Controller;

public class Player extends GlobalPosition {

	//path of the image in the system
	int velX=0,velY=0;
	private String playerimage="/images/Spaceship.png";
	private LinkedList<Enemy> e = Controller.getBounds();
	public Player(int x, int y) {
		//calling the constructor of the superclass(GlobalPosition)
		super(x, y);
	}
	
	public void update()
	{
		x+=velX;
		y+=velY;
		if(x<0)
		x=0;
		if(y<0)
		y=0;
		if(x>595)
		x=595;
		if(y>410)
		y=410;
		Collision();
	}
	public void Collision()
	{
		for(int i=0;i<e.size();i++)
		{
			if(getBounds().intersects(e.get(i).getBounds()))
			{
                System.out.println("YOU ARE DEAD!");
                System.exit(1);
			}
		}
	}
	public void keyPressed(KeyEvent e)
	{
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_RIGHT)
        velX=5;
		else if(key==KeyEvent.VK_LEFT)
	    velX=-5;
	}
	public void keyReleased(KeyEvent e)
	{
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_RIGHT)
        velX=0;
		else if(key==KeyEvent.VK_LEFT)
	    velX=0;
	}
	public Rectangle getBounds()
	{
		return new Rectangle(x,y,30,30);
	}
	public void draw(Graphics2D g2d)
	{
		/*drawImage->>function
		  getPlayerImage->>source_path of the image 
		  x,y->>distance for the origin
		  null->>rest parameters of the function drawImage 
		 */
		g2d.drawImage(getPlayerImage(), x, y, null);
	    g2d.draw(getBounds());
	}
	//function to create images
	public Image getPlayerImage()
	{
		//ImageIcon->>class which paints icon from images
		ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
	    return i.getImage(); //returns the url of the image
	}

}
