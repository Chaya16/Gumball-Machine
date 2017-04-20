import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public Gumball dispenseGumball()
    {
      Gumball gb = null;
      /* A randon number is generated and based on that the specific gumball class is instantiated.*/
      int i = Greenfoot.getRandomNumber(3);
      switch(i)
      {
            case 0:
                gb = new GreenGumball();
                break;
            case 1:
                gb = new RedGumball();
                break;
            case 2:
                gb = new BlueGumball();
                break;
      }
      return gb;
        
    }
}
