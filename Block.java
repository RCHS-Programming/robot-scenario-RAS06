import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rotating block, only moving structure.
 * 
 * @author Riz 
 * @version Intro
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnBlock();
    }    
        //Rotates the structure. 
    public void turnBlock ()
    {
        turn(2);
    }
}
