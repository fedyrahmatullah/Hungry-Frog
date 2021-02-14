import greenfoot.*;

public class Frog extends Actor
{
  private GreenfootImage image1;
  private GreenfootImage image2;
  private GreenfootImage image3;
  private boolean isGoingFast;
    public void act()
  {
   handleMovement();
   UlarCollision();
   grabBug();
   if ( ! isGoingFast ) 
   {
        animate();
   }
  }
  public void UlarCollision()
  {
      if (isTouching(Ular.class))
   {
      setLocation( 400, 500);
      Greenfoot.playSound("frog.wav");
      Latar Latar = (Latar)getWorld();
           Latar.removeLives(-1);
   }
   }
  public void handleMovement() 
  {
    move(1);
    if (Greenfoot.isKeyDown("left")) 
    {
        turn(-3);  
    }    
    if (Greenfoot.isKeyDown("right")) 
    {
        turn(3);
    } 
    if (Greenfoot.isKeyDown("up"))
    {
        move(5);
    }
    else
    {
        move(2);
    }
    if (Greenfoot.isKeyDown("up"))
    {
        isGoingFast = true;
        setImage(image3);
    }
    else
    {
        isGoingFast = false;
    }
  }
  public void grabBug()
  {
    if (isTouching(Bug.class))
    {
        removeTouching(Bug.class);
        getWorld().addObject (new Bug(250), (Greenfoot.getRandomNumber(650)+70), (Greenfoot.getRandomNumber(450)+70));
        Greenfoot.playSound("Waha.wav");
        Latar Latar = (Latar)getWorld();
           Latar.updateScore(+1);
    }
  }
  public void animate()
  {
   if (getImage().equals(image1))
   {
    setImage(image2);
   }
   else
   { 
    setImage(image1);
   }
  }
  public Frog()
  {
   image1 = new GreenfootImage("frogyn.png");
   image2 = new GreenfootImage("frogynCopy.png");
   image3 = new GreenfootImage("frogynCopyCopy.png");
   isGoingFast = false;
   setImage(image1); 
  }
}
