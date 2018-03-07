
/**
 * Write a description of class Curse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Curse extends Enhancement
{
    public Curse()
    {
        super("Cursed enancement spell", 10);
    }
    
    public void enhance(Player user, Ammo target)
    {
        target = new DarkArrow();
    }
}
