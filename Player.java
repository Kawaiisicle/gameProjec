
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Player extends Character
{
    int maxHP;
    int mana;
    int strength;
    int speed;
    
    public Player(String name, int hp, int mp, int str, int spd)
    {
        super(name,hp);
        this.maxHP = hp;
        this.mana = mp;
        this.strength = str;
        this.speed = spd;
    }
    
    public void attack(Weapon wep, Character target)
    {
        System.out.println("You attack " + target.getName() + " with " + wep.getName() + ".");
        if(wep.getClass() == Melee.class)
        {
            int damage = wep.getDmg();
            if((int)((Math.random() * 100) + 1) <= ((Melee) wep).getCrit())
            {
                damage = damage*2;
                System.out.println("Critical hit!");
            }
            target.takeDamage(damage);
            System.out.println(target.getName() + "'s health is now " + target.getHealth() + ".");
            //((Melee) wep).applyDebuffs(target); (***Implement this please, Noah***)
        }
        else if(wep.getClass() == Ranged.class)
        {
            
        }
    }
    
    public int getStr()
    {
        return strength;
    }
    
    public int getSpd()
    {
        return speed;
    }
    
    public int getMaxHP()
    {
        return maxHP;
    }
    
    public void useConsumable(Consumable item)
    {
        this.takeDamage(0-item.getEffect());
    }
}
