
/**
 * Write a description of class Useable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Useable extends Item
{
    boolean multiUse;
    public Useable(String name, int wt, boolean use)
    {
        super(name,wt);
        this.multiUse = use;
    }
}
