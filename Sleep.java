
/**
 * Write a description of class Sleep here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sleep extends Enhancement
{
    public Sleep()
    {
        super("Sleep Ehancement Spell", 10);
    }
    
    public void enhance(Player user, Ammo target)
    {
        target = new SleepDart();
    }
}
