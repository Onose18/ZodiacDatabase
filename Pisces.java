
/**
 * Write a description of class Pisces here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pisces
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Pisces";
    private static String color = "Mauve, Lilac,Purple,Violet, Sea Green";
    private static String element = "Water";
    private static String planetRuler = "Neptune, Jupiter";
    private static String bestPartnerZodiac = "Virgo, Taurus";

  
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
