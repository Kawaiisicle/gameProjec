
/**
 * Write a description of class Spell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spell
{
    String name;
    int manaReq;
    boolean learned;
    
    public Spell(String name, int mp)
    {
        this.name = name;
        this. manaReq = mp;
        boolean learned = false;
    }
    
    public String getName()
    {
        return name;
    }
}
