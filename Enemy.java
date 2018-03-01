
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
public class Enemy extends Character
{
    int damage;
    int strength;
    int speed;
    ArrayList<String> debuffs;
    
    public Enemy(String name, int health, int dmg, int str, int spd)
    {
        super(name, health);
        debuffs = new ArrayList<String>();
        this.damage = dmg;
        this.strength = str;
        this.speed = spd;
    }
    
    public void debuff(String eff)
    {
        debuffs.add(eff);
    }
    
    public void listDebuffs()
    {
        if(debuffs.size() < 1)
        {
            System.out.println(this.name + " has no active effects.");
        }
        else
        {
            System.out.print(this.name + " is ");
            for(int i = 0; i < debuffs.size()-1; i++)
            {
                System.out.print(debuffs.get(i) + ", ");
            }
            System.out.println("and " + debuffs.get(debuffs.size()-1) + ".");
        }
    }
    
    public boolean blocked(Player att)
    {
        double chanceOfFail = (att.getStr() + att.getSpd()) / (strength + speed);
        if(((int)Math.random()*100) <= chanceOfFail*50)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
