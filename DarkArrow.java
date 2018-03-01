
/**
 * Write a description of class CursedArrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DarkArrow extends Ammo
{
    public DarkArrow()
    {
        super("dark arrow",1,3);
    }
    
    public void effect(Enemy target)
    {
        target.debuff("cursed");
    }
}
