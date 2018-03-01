
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
public abstract class Item implements ItemInterface{
    String name;
    int weight;
    
    public Item(String name, int wt)
    {
        this.name = name;
        this.weight = wt;
    }
    
    public ArrayList getStats()
    {
        ArrayList<Integer> stats = new ArrayList();
        stats.add(weight);
        return stats;
    }
    
    public void setName(String newN)
    {
        this.name = newN;   
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getWeight()
    {
        return weight;
    }
}
