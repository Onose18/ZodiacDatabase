import java.util.Scanner;
public class ReportZodiac
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people will be doing this survey: ");
        int survNum = scan.nextInt();
        Survey[] survList = new Survey[survNum]; 
        int[] ids = new int[survNum];
        for(int i=0; i< survList.length; i++)
        {
         Survey surv1 = new Survey();
         survList[i] = surv1;
         ids[i] = i;
        }
        
        
        
        for(Survey survey: survList )
        {
            for (int j= 0; j< ids.length; j++)
            {
                survey.askInfo();
                AstroZodiac azPerson = new AstroZodiac(survey.getMonth(), survey.getDay());
                ChineseZodiac chPerson = new ChineseZodiac(survey.getYear());
                System.out.println("Gathering Data....");
                System.out.println("-----------------------------------------------");
                System.out.println("ID: #"+ids[j]);
                System.out.println("Your Information:");
                survey.reportInfo();
                System.out.println("-------------------------------------------->Your Zodiac Info:");
                azPerson.checkZodiac();
                chPerson.checkYear();
                System.out.println("******************************************************************************************");
            }
            
        }
    }

 
}
