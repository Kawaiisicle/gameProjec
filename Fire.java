
/**
 * Write a description of class Fire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fire extends Enhancement
{
    public Fire()
    {
        super("Fire enhancement spell", 10);
    }
    
    public void enhance(Player user, Ammo target)
    {
        target = new FireArrow();
    }
}
