import java.util.Scanner;

/**
 * Write a description of class Survey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Survey
{
    private String userName;
    private int userAge;
    private String userMonth;
    private int userDay;
    private int userYear;
    private String userFaveColor;
    
    public void askInfo(){
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter your Name : ");
       userName = keyboard.next();
       
       System.out.println("Enter your Age : ");
       userAge = keyboard.nextInt();
       
       System.out.println("Enter your Birth Month : ");
       userMonth = keyboard.next();
       
       System.out.println("Enter your Birth Day : ");
       userDay = keyboard.nextInt();
       
       System.out.println("Enter your Birth Year : ");
       userYear = keyboard.nextInt();
       
       System.out.println("Enter your favorite Color : ");
       userFaveColor = keyboard.next();
    }
    
    public void reportInfo()
    {
        System.out.println("Name: "+userName+"\nAge: "+userAge+"\nD.O.B: "+userMonth+"/"+userDay+"/"+userYear+ "\nFave Color: "+userFaveColor);
    }
    public String getName()
    {
        return userName;
    }
    
    public int getAge()
    {
       return userAge;
    }
    
    public String getMonth()
    {
        return userMonth;
    }
    
    public int getDay()
    {
        return userDay;
    }
    
    public int getYear()
    {
        return userYear;
    }
    
    public String getFavColor()
    {
        return userFaveColor;
    }
}


