import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kembali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the Kembali wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back ()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /4, image.getHeight() /4);
        setImage(image);
    }
    public void act() 
    {
          if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new StartMenu());
          
        
    }    

   }
}







