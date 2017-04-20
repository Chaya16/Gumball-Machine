import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
   World world;
   Actor coinActor = null;
   Display haveCoinDisplay = null;
   
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        // Add your action code here.
        world = getWorld();
                
        if (null == coinActor)
        {
            coinActor=getOneObjectAtOffset(0,30,Coin.class);
        }
              
        if (coinActor != null )
        {
           world.removeObject(coinActor);
        
           if (haveCoinDisplay == null) {
               haveCoinDisplay = new Display();         
               haveCoinDisplay.displayMsg("Have Coin");
               world.addObject(haveCoinDisplay, 230, 230);
           }
        }
        
        if(Greenfoot.mousePressed(this))
        {
            int mix =  Greenfoot.getMouseInfo().getX();
            int miy =  Greenfoot.getMouseInfo().getY();
            if (( mix <= 364 + 15 && mix >= 364 - 15) && (miy <= 327 + 15 && miy >= 327 -15)) {
            
                if(coinActor == null)
                    return;
                world.removeObject(haveCoinDisplay);
                haveCoinDisplay = null;
                crankTurned((Coin)coinActor);
                coinActor = null;
            }
        }
    }  
    
    public void crankTurned(Coin coin)
    {
        List<Inspector> i = getWorld().getObjects(Inspector.class);
        Display crankTurnDisplay = new Display();
        crankTurnDisplay.displayMsg("Crank Turned");        
        world.addObject(crankTurnDisplay, 200, 500);
        for(ListIterator<Inspector> it = i.listIterator();it.hasNext();)
        {
            it.next().checkCoin(coin);
        }
        world.removeObject(crankTurnDisplay);
    }
}
