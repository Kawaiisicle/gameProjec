
/**
 * Write a description of class Poison here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poison extends Enhancement
{
    public Poison()
    {
        super("Poison enhancement spell", 10);
    }
    
    public void enhance(Player user, Ammo target)
    {
        target = new PoisonArrow();
    }
}
