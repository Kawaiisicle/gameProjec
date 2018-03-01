
/**
 * Write a description of class EffectSpell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EffectSpell extends Spell
{
    int effect;
    
    public EffectSpell(String name, int mp, int eff)
    {
        super(name,mp);
        this.effect = eff;
    }
}
