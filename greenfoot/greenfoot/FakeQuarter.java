import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FakeQuarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FakeQuarter extends Quarter
{

    public FakeQuarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ; 
    }
    
    public double getValue()
    {
        return 0.0;
    }
    
    public String toString()
    {
        return "It's a Fake Quarter!!";
    }
}
