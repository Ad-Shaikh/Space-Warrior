//package for organizing various classes
package com.sk_hammad.arcade;
//package to import the swing library(class JFrame)
import javax.swing.JFrame;
public class Game {
public static void main(String [] args)
{
	//creating an object for calling constructor-JFrame
	JFrame frame = new JFrame("***THE SPACE WARRIOR***");
	//for packing all the components to their preferred sizes
	frame.pack();
	//for sizing the frame(window)
	frame.setSize(640,480);
	//cannot be resized again
	frame.setResizable(false);
	//for terminating the program after clicking on x-button 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//for aligning the frame to the center
	frame.setLocationRelativeTo(null);	
	//so that the frame(window) gets visible
	frame.setVisible(true);
	//adding(linking) the Game_1 class with the frame  
    frame.add(new Game_1());
}
}
