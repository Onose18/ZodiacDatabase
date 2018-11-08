
/**
 * Write a description of class Scorpio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scorpio
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Scorpio";
    private static String color = "Scarlet,Red, Rust";
    private static String element = "Water";
    private static String planetRuler = "Pluto,Mars";
    private static String bestPartnerZodiac = "Taurus, Cancer";

  
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
