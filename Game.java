
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Game
{
    Player player;
    Backpack pack;
    public Game()
    {
        this.pack = new Backpack();
    }
    
    public void createPlayer()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, player! What is your name?");
        String name = scanner.next();
        System.out.println("Are you sure your name is " + name + "?");
        if(scanner.next().equals("Yes"))
        {
            System.out.println("Fantastic! Hello, " + name + ".");
        }
        else
        {
            System.out.println("Well, too bad. Should have thought before you answered, " + name + ".");
        }
        this.player = new Player(name, 100, 100, 10, 10);
    }
    
    public void testAddingItems()
    {
        pack.storeItem(new Consumable("bread", 1, 5));
        pack.storeItem(new Consumable("bread", 1, 5));
        pack.storeItem(new Consumable("water", 2, 3));
        pack.storeItem(new Consumable("health potion", 2, 25));
        pack.storeItem(new Melee("hammer", 5, 10, 50));
        pack.storeItem(new Ranged("bow", 5, 10, 1));
    }
    
    public void main()
    {
        
    }
}
