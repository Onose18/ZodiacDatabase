
/**
 * Write a description of class Sagittarius here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sagittarius
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Sagittarius";
    private static String color = "Blue";
    private static String element = "Fire";
    private static String planetRuler = "Jupiter";
    private static String bestPartnerZodiac = "Gemini, Aries";

  
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
