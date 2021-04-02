
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main character. Grabs pizza and goes home. 
 * 
 * @author Riz 
 * @version Intro
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1 =  new GreenfootImage("man01.png");
    private GreenfootImage robotimage2 = new GreenfootImage("man02.png");
    private GreenfootImage gameOver = new GreenfootImage("gameover.png");
    
    int imageSwitch = 10;
    int lives = 3;
    int score;
    int pizzaEaten;
    
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        eatPizza();
        robotMovement();
        detectHome();
        detectWallCollision();
        detectBlockCollision();
        showStatus();
        goAheadAndTry();
    }    
        //Moves the Robot. 
    public void robotMovement() 
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            animate();
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            animate();
            setLocation(getX(), getY() + 3); 
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            animate();
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            animate();
            setLocation(getX() + 3, getY());
        }
    }
        //Checks wall collision. 
    public void detectWallCollision ()
    {
        if(isTouching(Wall.class))
        {
            setLocation(50, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
        //Checks block collision. 
    public void detectBlockCollision () 
    {
        if(isTouching(Block.class))
        {
            setLocation(50, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
        //Checks to see if the house was touched
    public void detectHome () 
    {
        if(isTouching(Home.class))
        {
            //WHY ARE COMPOUND IF-STATEMENTS NOT WORKING?!?!
            if(pizzaEaten == 5)
            {
                Greenfoot.playSound("yipee.wav");
                setLocation(50, 50); 
                score++;
            }
        }
    }
        //Checks to see if the robot has come across any food. 
    public void eatPizza ()
    {
        if(isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten++;
        }
    }
        //Animates the walking of the robot. 
    public void animate() 
    {
         if(imageSwitch >= 20) {
            
            if(getImage() == robotimage1) {
                 setImage(robotimage2);
                } else if (imageSwitch >= 40){
                 setImage(robotimage1);
                 imageSwitch = 0;
                }
                
            }
        imageSwitch++;
    }
        //Removes a life from the Robot. 
    public void removeLife ()
    {
        lives--;
        testEndGame();
    }
        //Tests to see if the robot has died. 
    public void testEndGame()
    {
        if(lives <= 0)
        {
            greenfoot.Greenfoot.stop();
            setImage(gameOver);
        }
    }
        //Shows the properties of RObot. 
    public void showStatus()  
    {
        getWorld().showText("Lives: " + lives, 70, 540);
        getWorld().showText("Pizzas: " + pizzaEaten, 70, 560);
    }
            //Good Luck Winning lol. 
    public void goAheadAndTry ()
    {
        if(score == 3) 
        {
            score++;
            getWorld().addObject(new Block(), 500, 400);
        }
        if(score == 6)
        {
            score++;   
            getWorld().addObject(new Block(), 300, 450);
        }
    }
}
