
/**
 * Write a description of class Poison here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poison extends EnhancementSpell
{
    public Poison()
    {
        super("Poison Ehancement Spell", 10);
    }
    
    public void enhance(Player user, Ammo target)
    {
        target = new PoisonArrow();
    }
}
