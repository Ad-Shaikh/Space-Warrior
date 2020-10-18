package com.sk_hammad.arcade;
//importing the abstract window toolkit library 
import java.awt.Graphics;
//Graphics2D >>> Graphics
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//importing the JPanel(container class)
import javax.swing.JPanel;
import javax.swing.Timer;

import com.sk_hammad.arcade.input.Controller;
import com.sk_hammad.arcade.input.KeyInput;
import com.sk_hammad.arcade.objects.Player;

public class Game_1 extends JPanel implements ActionListener {
	
	Player p;
	Controller c;
	Menu menu;
	String background ="/images/Space.png";
	//universal serial identifier for serializable classes
	private static final long serialVersionUID = 1L;
    //Creating a constructor
	Timer gametimer;
	public static enum STATE
	{
		MENU,
		GAME
	};
	public static STATE State=STATE.MENU;
	public Game_1()
	{
        //for making all the components set to focus
		setFocusable(true);
	    gametimer = new Timer(10,this);
	    gametimer.start();
	    p=new Player(300,480);
	    c=new Controller();
	    menu=new Menu();
	    addKeyListener(new KeyInput(p));
	    addMouseListener(new MouseInput());
	}
   //Overriding the paint function of the JPanel
   public void paintComponent(Graphics g)
   {
	   //calling the paint function from the superclass 
	   super.paintComponent(g);
	   Graphics2D g2D = (Graphics2D) g;
	   g2D.drawImage(getBackgroundImage(),0,0,null);
	  
	  if(State==STATE.GAME)
	  {	  
	   p.draw(g2D);
       c.draw(g2D);
	  }
	  else if(State==STATE.MENU)
	  {
		  menu.draw(g2D);
	  }
   }
   public Image getBackgroundImage()
   {
	   ImageIcon i = new ImageIcon(getClass().getResource(background));
	   return i.getImage();
   }
public void actionPerformed(ActionEvent ee) {
   
	//calling the repaint function of the JPanel class(for repetitive process)
	repaint();
    if(State==STATE.GAME)
    { 	
	p.update();
	c.update();
    }
    }
}
