
/**
 * Write a description of class Choice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Choice
{
    String question;
    ArrayList<String> choices;
    int answer;
    public Choice(String question)
    {
        this.question = question;
        choices = new ArrayList<String>();
        answer = -1;
    }
    
    public void add(String option)
    {
        choices.add(option);
    }
    
    public String response()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    
    public String findString(ArrayList<String> list, String string)
    {
        String input = string.toUpperCase();
        for(String str : list)
        {
            String newStr = str.toUpperCase();
        }
        return null;
    }
    
    public int ask()
    {
        System.out.println(question);
        for(String choice : choices)
        {
            System.out.print(choices.indexOf(choice)+1 + ". - ");
            System.out.println(choice);
            System.out.println();
        }
        String response = response();
        return 0; //don't do this. get rid of this. please.
    }
}
