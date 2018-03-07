
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
    
    public int damageMod(Player player)
    {
        int pStr = player.getStr();
        /**
         * damage mod is calculated by multiplying base strength
         * by the ratio of enemy/player strength (rounds up).
         * 
         *  Low strength enemy vs. High strength player
         *      Enemy str = 5       Player str = 15
         *      5 * 5/15 --> 5/3 ; round --> 1 ; + 1 --> 2
         *      
         *  High strength enemy vs. low strength player
         *      Enemy str = 15      Player str = 5
         *      15 * 15/5 --> 255/3 ; round --> 45 ; + 1 = 46;
         *      
         * This damage advantage is added to existing damage,
         * serving to make facing high-strength enemies more
         * dangerous when the player is at a low level. 
         * 
         * 
         * (as well as making being over-leveled super good)
         */
        return (int)(strength*strength/pStr)+1;
    }
    
}
