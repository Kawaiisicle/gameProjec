
/**
 * Write a description of class Companion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Companion extends NPC
{
    int affinity;
    String[] states;
    public Companion(String name, int health)
    {
        super(name, health);
        this.affinity = 0;
        this.states = new String[5];
    }
    
    public int getAff()
    {
        return affinity;
    }
    
}
