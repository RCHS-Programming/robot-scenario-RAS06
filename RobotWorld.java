import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Land of pizza, rotating blocks, and houses in the middle of nowhere.
 * 
 * @author Riz 
 * @version (Intro)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        super(800, 600, 1); 
        
        addObject(new Robot(), 50, 50);
        
        
        //Wall section. 
        
        addObject(new Wall(), 50, 150);
        addObject(new Wall(), 100, 150);
        addObject(new Wall(), 150, 150);
        addObject(new Wall(), 200, 150);
        addObject(new Wall(), 220, 150);
        
        addObject(new Block(), 400, 150);
    
        addObject(new Wall(), 580, 150);
        addObject(new Wall(), 600, 150);
        addObject(new Wall(), 650, 150);
        addObject(new Wall(), 700, 150);
        addObject(new Wall(), 750, 150);
        
        //End wall section. 
        
        
        //House
        
        addObject(new Home(), 760, 560);
        
        //End house.
        
        
        //Score panel. 
        
        addObject(new Scorepanel(), 80, 550);
        
        //End Score Panel. 
        
        
        //Begin objectives
        
        
            //Above Wall
            
        addObject(new Pizza(), (Greenfoot.getRandomNumber(780) + 10), (Greenfoot.getRandomNumber(75) + 10));
        addObject(new Pizza(), (Greenfoot.getRandomNumber(780) + 10), (Greenfoot.getRandomNumber(75) + 10));
        
            //End Above Wall
            
            
            //Below Wall
            
        addObject(new Pizza(), (Greenfoot.getRandomNumber(780) + 10), (Greenfoot.getRandomNumber(240) + 210));
        addObject(new Pizza(), (Greenfoot.getRandomNumber(780) + 10), (Greenfoot.getRandomNumber(240) + 210));
            
            //End Below Wall
            
            
            //Being Between Section 
            
        addObject(new Pizza(), (Greenfoot.getRandomNumber(410) + 190), (Greenfoot.getRandomNumber(75) + 500));
            
            //End Between Section.
            
            
            
            
            
    }
}
