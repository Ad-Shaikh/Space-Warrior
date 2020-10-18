package com.sk_hammad.arcade.input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import com.sk_hammad.arcade.objects.Enemy;

public class Controller {
	
   static LinkedList<Enemy> e = new LinkedList<Enemy>();
   Enemy tempenemy;
   public Controller()
   {
	    addEnemy(new Enemy(50,0));
	    addEnemy(new Enemy(100,0));
	    addEnemy(new Enemy(200,0));
	    addEnemy(new Enemy(300,0));
	    addEnemy(new Enemy(500,0));
	    addEnemy(new Enemy(600,0));
	    addEnemy(new Enemy(250,0));
   }
   public void draw(Graphics2D g2d)
   {
	   for(int i=0;i<e.size();i++)
	   {
		   tempenemy=e.get(i);
		   tempenemy.draw(g2d);
	   }
   }
   public void update()
   {
	   for(int i=0;i<e.size();i++)
	   {
		   tempenemy=e.get(i);
		   tempenemy.update();
	   }
    }
   public void addEnemy(Enemy enemy)
   {
	   e.add(enemy);  
   }
   public void removeEnemy(Enemy enemy)
   {
	   e.remove(enemy);  
   }
  public static LinkedList<Enemy> getBounds()
  {
	 return e; 
  }
}
