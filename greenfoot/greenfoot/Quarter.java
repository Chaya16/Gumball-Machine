import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quarter extends Coin
{

    public Quarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ;           
    }
  
    public double getValue()
    {
        return 0.25;
    }
    
    public String toString()
    {
        return "It's a Quarter!!";
    }
}
