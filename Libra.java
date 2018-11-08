
/**
 * Write a description of class Libra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libra
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Libra";
    private static String color = "Pink, Green";
    private static String element = "Air";
    private static String planetRuler = "Venus";
    private static String bestPartnerZodiac = "Aries, Sagittarius";

  
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
