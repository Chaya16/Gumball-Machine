import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    Display d = null ;
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    public void checkCoin(Coin coin)
    {
      World world = getWorld();
      
      //delete old message
      if(d != null) {
          world.removeObject(d);
       }
      d = new Display();
      d.displayMsg(coin.toString());
      world.addObject(d, this.getX(), this.getY());
      Greenfoot.delay(60);
      getWorld().removeObject(d);
       if (coin.getValue() >= 0.25)
       {
            pickAlien();
       }
      
    }
    
    public void pickAlien()
    {
        List<GreenPicker> gpList = getWorld().getObjects(GreenPicker.class);
        List<RandomPicker> rpList = getWorld().getObjects(RandomPicker.class);
        ListIterator<GreenPicker> it1 = gpList.listIterator();
        ListIterator<RandomPicker> it2 = rpList.listIterator();
        
        Picker p;
        Gumball gb;
        int i = Greenfoot.getRandomNumber(2);
        if (0 == i)
        {
            p = it1.next();
        }
        else
        {
            p = it2.next();
        }
        
        gb = p.dispenseGumball();
        getWorld().addObject( gb , 370, 500 );
        
        d = new Display();
        d.displayMsg(gb.toString());
        getWorld().addObject(d, p.getX(), p.getY());
        Greenfoot.delay(60);
        getWorld().removeObject(d);
        getWorld().removeObject(gb);
    }       
}
