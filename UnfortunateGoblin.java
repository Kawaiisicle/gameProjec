
/**
 * Write a description of class UnfortunateGoblin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnfortunateGoblin extends Enemy
{
    public UnfortunateGoblin()
    {
        super("Unfortunate goblin", 10, 0, 5, 5);
        this.debuff("asleep");
        this.debuff("on fire");
        this.debuff("cursed");
        this.debuff("paralized");
        this.debuff("bleeding");
        this.debuff("crippled");
        this.debuff("dead");
        this.debuff("depressed");
    }
    
}
