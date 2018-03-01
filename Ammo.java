
/**
 * Write a description of class Ammo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
public class Ammo extends Item
{
    int ammoType;
    
    public Ammo(String name, int wt, int type)
    {
        super(name, wt);
        this.ammoType = type;
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
}
