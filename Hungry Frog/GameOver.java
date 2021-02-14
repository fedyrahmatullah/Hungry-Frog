import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;

import java.io.*;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
         Latar();
        
    }
    public void Latar()
    {
       //Game Over
    }
    public GameOver()
    {
        GreenfootImage image = getImage();
      image.scale(image.getWidth() *1, image.getHeight() *1);
      setImage(image);
      
    }
}







