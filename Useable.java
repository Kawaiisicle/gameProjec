
/**
 * Write a description of class Useable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Useable extends Item
{
    boolean multiUse;
    String useText;
    public Useable(String name, int wt, boolean use, String useText)
    {
        super(name,wt);
        this.multiUse = use;
        this.useText = useText;
    }
    
    public void use()
    {
        System.out.println(useText);
    }
}
