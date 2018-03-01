
/**
 * Write a description of class SleepDart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SleepDart extends Ammo
{
    public SleepDart()
    {
        super("sleep dart",1,5);
    }
    
    public void effect(Enemy target)
    {
        target.debuff("asleep");
    }
}
