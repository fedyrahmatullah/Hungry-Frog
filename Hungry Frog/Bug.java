import greenfoot.*;

public class Bug extends Actor
{
 int timer;
 int maxtime;

 public void act() 
 {
     resetBug();
 }
 public Bug(int maxtime)
 {
    timer = 0;
    maxtime = 250-Greenfoot.getRandomNumber(50);
    this.maxtime = maxtime;
 }
 public void resetBug()
 {
     timer++;
     if (timer > maxtime)
     {
       timer = 0;
       setLocation(Greenfoot.getRandomNumber(650)+70, Greenfoot.getRandomNumber(450)+200);
     }
 }
}

