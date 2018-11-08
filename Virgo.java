
/**
 * Write a description of class Virgo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Virgo
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Virgo";
    private static String color = "Grey, Beige, Pale-Yellow";
    private static String element = "Earth";
    private static String planetRuler = "Mercury";
    private static String bestPartnerZodiac = "Pisces, Cancer";

  
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
