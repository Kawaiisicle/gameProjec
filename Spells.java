
/**
 * Write a description of class Spells here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
public class Spells
{
    ArrayList<Enchantment> enchantments = new ArrayList<Enchantment>();
    ArrayList<Enhancement> enhancements = new ArrayList<Enhancement>();
    ArrayList<ActSpell> actSpells = new ArrayList<ActSpell>();
    public Spells()
    {
            enchantments.add(new Enchantment( "Curse", 10, "Cursed", "of cursedness"));
            enchantments.add(new Enchantment( "Blessing", 10, "Blessed", "of piety"));
            enchantments.add(new Enchantment( "Flame", 10, "Smoldering", "of embers"));
            enchantments.add(new Enchantment( "Blood", 10, "Bleeding", "of blood"));
            enchantments.add(new Enchantment( "Radiance", 10, "Radiant", "of the Sun"));
            enchantments.add(new Enchantment( "Celestial", 10, "Astral", "of the Ether"));
            enchantments.add(new Enchantment( "Earth", 10, "Earthen", "of the soil"));
            enchantments.add(new Enchantment( "Stone", 10, "Stony", "of rock"));
            enchantments.add(new Enchantment( "Hell", 10, "Undead", "of death"));
            enchantments.add(new Enchantment( "Poison", 10, "Poisoned", "of poison"));
            enchantments.add(new Enchantment( "Plague", 10, "Plagued", "of sickness"));
            
            enhancements.add(new Fire());
            enhancements.add(new Curse());
            enhancements.add(new Sleep());
            enhancements.add(new Poison());
            
            actSpells.add(new MagicMissile());
            actSpells.add(new Explosion());
            actSpells.add(new LightningBolt());
            actSpells.add(new Fireball());
    }
    
    public Spell getSpell(String name)
    {
        for(Spell spell : enchantments)
        {
            if(spell.getName().equals(name))
            {
                return spell;
            }
        }
        for(Spell spell : enhancements)
        {
            if(spell.getName().equals(name))
            {
                return spell;
            }
        }
        for(Spell spell : actSpells)
        {
            if(spell.getName().equals(name))
            {
                return spell;
            }
        }
        return null;
    }
}
