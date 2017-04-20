import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penny here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penny extends Coin
{   

    public Penny()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;        
    }
    
    public double getValue()
    {
       return 0.01;
    }
    
    public String toString()
    {
        return "It's a Penny!!";
    }
}
