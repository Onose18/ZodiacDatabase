
/**
 * Write a description of class Leo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Leo
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Leo";
    private static String color = "Gold, Yellow, Orange";
    private static String element = "Fire";
    private static String planetRuler = "Sun";
    private static String bestPartnerZodiac = "Aquarius, Gemini";

  
    public String getColor()
    {
        return color;
    }
    
    public String getElement()
    {
        return element;
    }
    
    public String getPlanetRuler()
    {
        return planetRuler;
    }
    
    public String getBestPartnerZodiac()
    {
        return bestPartnerZodiac;
    }
    
    public void getZodiacInfo()
    {
        System.out.println("Your Zodiac: " + zodiac+ "\nYour Ideal Color: " + color + "\nYour Element: "+element+ "\nYour Planet Ruler: "+planetRuler+"\nYour Best Zodiac Partner: "+bestPartnerZodiac);
    }
}
