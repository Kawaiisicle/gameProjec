
/**
 * Write a description of class Tent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tent extends Useable
{
    boolean pitched;
    public Tent()
    {
        super("Tent",10,true,"You try to use the tent, but it's still bundled up.");
        this.pitched = false;
    }
    
    public void pitch()
    {
        if(pitched==false)
        {
            pitched = true;
            System.out.println("You pitch the tent.");
            useText = "You climb into your tent. It's not very roomy. You climb out of your tent.";
        }
        else
        {
            System.out.println("You try to pitch your tent again, but it's already up.");
            System.out.println("You end up knocking it over and it takes several minutes to remake.");
        }
    }
    
    public void unpitch()
    {
        if(pitched==true)
        {
            pitched = false;
            System.out.println("You take your tent down and bundle it up.");
            useText = "You try to use the tent, but it's still bundled up.";
        }
        else
        {
            System.out.println("You try to take your tent down, but it's in a bundle already.");
        }
    }
}