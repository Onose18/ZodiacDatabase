/**
 * Write a description of class Aries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aries
{
    // instance variables - replace the example below with your own
    private static String zodiac = "Aries";
    private static String color = "Red";
    private static String element = "Fire";
    private static String planetRuler = "Mars";
    private static String bestPartnerZodiac = "Libra, Leo";

  
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
