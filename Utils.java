
/**
 * Write a description of class SpellMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
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
    
    public void instSpells()
    {
        Enchantment curse = new Enchantment("Curse", 10, "Cursed", "of cursedness");
        Enchantment Blessing = new Enchantment("Blessing", 10, "Blessed", "of piety");
        Enchantment flame = new Enchantment( "Flame", 10, "Smoldering", "of embers");
        Enchantment blood = new Enchantment( "Blood", 10, "Bleeding", "of blood");
        Enchantment radiance = new Enchantment( "Radiance", 10, "Radiant", "of the Sun");
        Enchantment celestial = new Enchantment( "Celestial", 10, "Astral", "of the Ether");
        Enchantment earth = new Enchantment( "Earth", 10, "Earthen", "of the soil");
        Enchantment stone = new Enchantment( "Stone", 10, "Stony", "of rock");
        Enchantment hell = new Enchantment( "Hell", 10, "Undead", "of death");
        Enchantment poison = new Enchantment( "Poison", 10, "Poisoned", "of poison");
        Enchantment plague = new Enchantment( "Plague", 10, "Plagued", "of sickness");
        
        Fire fireArrow = new Fire();
        Curse curseArrow = new Curse();
        Sleep sleepArrow = new Sleep();
        Poison poisonArrow = new Poison();
    }
}

