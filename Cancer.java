
/**
 * Write a description of class Cancer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cancer
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Cancer";
    private static String color = "White";
    private static String element = "Water";
    private static String planetRuler = "Moon";
    private static String bestPartnerZodiac = "Capricorn, Taurus";

  
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
