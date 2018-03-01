
/**
 * Write a description of class Consumable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
public class Consumable extends Item
{
    int effect;
    
    public Consumable(String name, int wt, int efc)
    {
        super(name, wt);
        this.effect = efc;
    }
    
    public ArrayList getStats()
    {
        ArrayList stats = super.getStats();
        stats.add(effect);
        return stats;
    }   
    
    public String getName()
    {
        return name;
    }
    
    public int getEffect()
    {
        return effect;
    }
}
