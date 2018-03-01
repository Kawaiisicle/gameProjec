
/**
 * Write a description of class Consumable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Weapon extends Item implements WeaponInterface
{
    int damage;
    
    public Weapon(String name, int wt, int dmg)
    {
        super(name, wt);
        this.damage = dmg;
    }
    
    public int attack()
    {
        return damage;
    }
    
    public boolean parry()
    {
        int debuff = weight*5;
        if(((int)Math.random() * 100 + 1) > debuff)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public ArrayList getStats()
    {
        ArrayList stats = super.getStats();
        stats.add(damage);
        return stats;
    }
    
    public int getDmg()
    {
        return damage;
    }
    
    public String getName()
    {
        return name;
    }
}
