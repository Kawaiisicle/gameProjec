
/**
 * Write a description of class Companion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Companion extends NPC
{
    int affinity;
    
    public Companion(String name, int health, int aff)
    {
        super(name, health);
        this.affinity = aff;
    }
}
