import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{

    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {    
        // fedy startMenu
        super(996, 603, 1); 
        prepare();
    }
    private void prepare()
    {
        start start = new start();
        addObject(start, 750, 450);
        Help Help = new Help();
        addObject(Help,82,65);
        removeObject(Help);
        Help Help2 = new Help();
        addObject(Help2,445,334);
        Help2.setLocation(885,563);
    }
}
