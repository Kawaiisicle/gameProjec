
/**
 * This creates an Inventory for a character
 * 
 * @author Wiebe
 * @version 1.2
 */
import java.util.ArrayList;
public class Backpack implements BackpackInterface 
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> backpack;
    private int weight;

    /**
     * Constructor for objects of class Backpack
     */
    public Backpack()
    {
        // initialise instance variables
        backpack = new ArrayList<Item>();
    }

    /**
     * Adds an item to the backpack
     * 
     * @param  item   The item of which to add
     * @return     true if added
     */
    public boolean storeItem(Item item)
    {
        backpack.add(item);
        return true;
    }
    
    /**
     * Consumes an item in the backpack, removing it.
     * 
     * @param  item   The item of which to delete
     * @return     true if deleted
     */
    public boolean useItem(Item item)
    {
        for (int i=0; i<backpack.size(); i++)
        {
            if(backpack.get(i)==item)
            {
                backpack.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void updateWeight()
    {
        for(Item item : backpack)
        {
            weight += item.getWeight();
        }
    }
    
    public int getWeight()
    {
        return weight;  
    }
    
    /**
     * Gets the contents of the backpack
     * 
     * 
     * @return     An arraylist of Items in the backpack.
     */
    public void getInventory()
    {
        for(Item item : backpack)
        {
            System.out.print(item.getName() + ", ");
        }
    }
    
    public Item getItem(String name)
    {
        Item thing = backpack.get(0);
        for(Item item : backpack)
        {
            if(item.getName().equals(name))
            {
                thing = item;
            }
        }
        return thing;
    }
    
    public ArrayList<Item> getBackpack()
    {
        return backpack;
    }
    
    public int countItems()
    {
        int count = 0;
        for (Item item : backpack)
        {
            count++;
        }
        return count;
    }
}
