
/**
 * Write a description of class Ranged here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
public class Ranged extends Weapon
{
    int ammoType;

    public Ranged(String name, int wt, int dmg, int atype)
    {
        super(name, wt, dmg);
        this.ammoType = atype;
    }
    
    public ArrayList getStats()
    {
        ArrayList stats = super.getStats();
        stats.add(ammoType);
        return stats;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAmmo()
    {
        return ammoType;
    }
}
