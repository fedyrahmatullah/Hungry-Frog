import greenfoot.*;

    public class Ular extends Actor
{  
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    public void act() 
  {  
      move(2);
      removeAtEdge();
      animate();
  }
    public Ular()
  {
      setRotation(Greenfoot.getRandomNumber(134)+45);
      image1 = new GreenfootImage("snake2.png");
      image2 = new GreenfootImage("snake2Copy.png");
      image3 = new GreenfootImage("snake2CopyCopy.png");
      setImage(image1);
  }
    public void removeAtEdge()
  {   
      if (isAtEdge())
    {
        getWorld().removeObject(this);
    }
  }  
    public void animate()
  {
   if (getImage().equals(image1))
   {
    setImage(image3);
   }
   else
   { 
    setImage(image1);
   }
  }
}

