import greenfoot.*;

public class Latar extends World
{
    private int score = 0;
    private int lives = 3;
   
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
           addObject(new Ular(), Greenfoot.getRandomNumber(800), 10);
        }
        showScore();
        showLives();
    }
    public Latar()
    {    
        super(996, 600, 1); 
        int i = 0;
        while (i < 3)
        {
           addObject (new Ular(),(Greenfoot.getRandomNumber(800)), 10); 
           i = i+1;
        }
        
        int b = 0; 
        while (b < 3)
        {
           addObject (new Bug(250),(Greenfoot.getRandomNumber(600)+150) ,(Greenfoot.getRandomNumber(400)+100)); 
           b = b+1;
        }
        addObject (new Frog(), 400, 500);
    }
    
    public void updateScore(int points)
    {
        score = score + points;
        showScore();
        showText("Score:"+score, 40, 18);
        if(score>=150)
        {
            Greenfoot.stop();
            Greenfoot.playSound("youwin.wav");
            Win win = new Win();
            addObject(win, getWidth()/2, getHeight()/2);
        }
    }
    void showScore()
    {
        showText("Score:"+score, 40, 18);
        
    }
    public void removeLives(int points)
    {
        lives = lives + points;
        showLives();
        showText("Lives:"+lives, 40 , 40); 
        if(lives<=0)
        {
            Greenfoot.stop();
            Greenfoot.playSound("gameover.mp3");
            GameOver gameover = new GameOver();
            addObject(gameover, getWidth()/2, getHeight()/2);
        }
    }
    void showLives()
    {
        showText("Lives:"+lives, 40 , 40); 
    }
}
