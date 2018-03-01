
/**
 * Write a description of class Torch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Torch extends Useable
{
    boolean lit;
    public Torch()
    {
        super("Torch",2,true,"You examine the torch. The unlit, wooden torch. Not on fire. Illuminating nothing.");
        this.lit = false;
    }
    
    public void ignite()
    {
        if(lit==false)
        {                
            lit = true;
            System.out.println("You ignite the torch.");
            this.useText = "You look at the torch. Your eyes hurt, because you're staring straight at a fire.";
        }
        else
        {
            System.out.println("You try to light the torch, but it's already lit. Duh.");
        }
    }
    
    public void smother()
    {
        if(lit==true)
        {
            lit = false;
            System.out.println("You smother the flame of the torch. With your hand. It kind of hurts, actually.");
            this.useText = "You examine the torch. The unlit, wooden torch. Not on fire. Illuminating nothing.";
        }
    }
}
