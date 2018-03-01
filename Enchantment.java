
/**
 * Write a description of class Enchantment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Enchantment extends Spell
{
    String eff1;
    String eff2;
    
    public Enchantment(String name, int mp, String eff1, String eff2)
    {
        super(name, mp);
        this.eff1 = eff1;
        this.eff2 = eff2;
    }
    
    public void applyEffect(Player user, Item target)
    {
        if(this.learned)
        {
            if(Utils.coinFlip())
            {
                target.setName(this.eff1 + " " + target.getName());
            }
            else
            {
                target.setName(target.getName() + " " + this.eff2);
            }
        }
        else
        {
            System.out.println("You don't know that enchantment spell!");
        }
    }
}
