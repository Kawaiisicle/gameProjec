
/**
 * Write a description of class IncendiaryArrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FireArrow extends Ammo
{
    public FireArrow()
    {
        super("fire arrow",1,2);
    }
    
    public void effect(Enemy target)
    {
        target.debuff("on fire");
    }
}
