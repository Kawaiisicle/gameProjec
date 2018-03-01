
/**
 * Write a description of class PoisonArrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoisonArrow extends Ammo
{
    public PoisonArrow()
    {
        super("poison arrow",1,4);
    }
    
    public void effect(Enemy target)
    {
        target.debuff("poisoned");
    }
}
