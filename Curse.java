
/**
 * Write a description of class Curse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Curse extends EnhancementSpell
{
    public Curse()
    {
        super("Cursed Ehancement Spell", 10);
    }
    
    public void enhance(Player user, Ammo target)
    {
        target = new DarkArrow();
    }
}
