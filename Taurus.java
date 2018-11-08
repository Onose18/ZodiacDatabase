
/**
 * Write a description of class Taurus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Taurus
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Taurus";
    private static String color = "Green, Pink";
    private static String element = "Earth";
    private static String planetRuler = "Venus";
    private static String bestPartnerZodiac = "Scorpio, Cancer";

  
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
