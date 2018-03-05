
/**
 * Write a description of class ActSpell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActSpell extends Spell
{
    String action;
    String fail;
    public ActSpell(String name, int mp, String act, String fail)
    {
        super(name,mp);
        this.action = act;
        this.fail = fail;
    }
    
    public void cast(Player user)
    {
        if(user.getMP()>=this.manaReq)
        {
            user.changeMP(0-this.manaReq);
            System.out.println("You cast "+ name +".");
            System.out.println(action);
        }
        else
        {
            System.out.println(fail);
        }
    }
}
    
