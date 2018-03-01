
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character
{
    String name;
    int health;
    
    public Character(String n, int hp)
    {
        this.name = n;
        this.health = hp;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void takeDamage(int dmg)
    {
        this.health -= dmg;
    }
    
    public String printHealth()
    {
        return name + "'s health is " + health + ".";
    }
}
