import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main character. Grabs pizza and goes home. 
 * 
 * @author Riz 
 * @version Intro
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }    
        //Moves the Robot. 
    public void robotMovement() 
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY() + 3); 
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX() + 3, getY());
        }
    }
        //Checks wall collision. 
    public void detectWallCollision ()
    {
        if(isTouching(Wall.class))
        {
            setLocation(50, 50);
        }
    }
        //Checks block collision. 
    public void detectBlockCollision () 
    {
        if(isTouching(Block.class))
        {
            setLocation(50, 50);
        }
    }
}
