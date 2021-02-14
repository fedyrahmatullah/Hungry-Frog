import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpTab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpTab extends World
{
    
    
    
    /**
     * Constructor for objects of class HelpTab.
     * 
     */
    public HelpTab()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(994, 603, 1);
        prepare();
    }
    private void prepare()
    {

        Back Back = new Back();
        addObject(Back,83,43);
        Back.setLocation(46,37);
    }
}


