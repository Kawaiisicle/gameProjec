
/**
 * Class containing various functions related to gameplay.
 * Randomization, turn computation, etc.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
public class Utils
{
    public static boolean coinFlip()
    {
        if((Math.random()* 1) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static int roll(int faces)
    {
        int result = (int)(Math.random() * faces) + 1;
        return result;
    }
    
    public void combat(Player player, Enemy enemy)
    /**
     * Okay, so. Here's the deal.
     * 
     * for enemy turn:
     *  attack() to determine damage
     *  compare to player stats to determine hit/miss.
     * for player turn:
     *  if under attack...
     *      give chance to parry
     *      calculate parry 
     *  if not...
     *      give chance to attack
     *      give chance to act
     *      give chance to use spell/item
     *      give chance to attempt flee
     */
    {
        
    }
}

