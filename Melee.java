
/**
 * Write a description of class Melee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
public class Melee extends Weapon
{
    int critChance;
    
    public Melee(String name, int wt, int dmg, int crit)
    {
        super(name, wt, dmg);
        this.critChance = crit;
    }
    
    public ArrayList getStats()
    {
        ArrayList stats = super.getStats();
        stats.add(critChance);
        return stats;
    }
    
    public int getCrit()
    {
        return critChance;
    }
    
    public String getName()
    {
        return name;
    }
}
