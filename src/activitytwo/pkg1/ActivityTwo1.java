
package activitytwo.pkg1;

import java.util.Scanner;


public class ActivityTwo1 {

   
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Unsay Size sa imong Stack Madam?");
        int size = scn.nextInt();
        ActivityTwoClassFive five = new ActivityTwoClassFive(size);
        
        while(true){
            System.out.println("\nClick sa 1 madam para mag PUSH ang buntis:");
            System.out.println("Click sa 2 madam para mag POP ang balloon:");
            System.out.println("Click sa 3 madam para mag PEEK ang gibinggit:");
            System.out.println("Click 4 na dayun para mag LOOP:");
            System.out.println("Pislita gud palihug ang 5 para maka-exit naka, yaya kaayo:");
            System.out.println("Click ang 6 para makabalo ka sa numbers of elements of the periodic table:");
            System.out.println("NAAY NAG DUPLICATE?? E CLICK NA DAYUN ANG 7!:");
            System.out.println("Click 8 dayun kung sino ang TOP!!:");
            System.out.println("Click 9 dayun kung sino ang BOTTOM!!:");
            System.out.println("Click 10 dayun para maka ADD!:");
            System.out.println("Click 11 MAO NANI ANG BAG ONG COLLECTION:\n");
            
            
            int levels = scn.nextInt();
        if(levels == 1){
            System.out.println("\nBUTANGI DAYUG NUMBER BAYOTT!:");
            int push = scn.nextInt();
            five.push(push);
        }
        else if(levels == 2){
            System.out.println("\nMAO NA DAYUN NI IMUHANG GI POP!!:" +" " + five.pop());
        }
        else if(levels ==3){
            System.out.println("\nHALA NI SILIP NI NGA NUMBER MADAM!:" + " " + five.peekTop());
        }
        else if(levels ==4){
            System.out.println("\nALL VALUE:");
            five.verification();
        
        }
        else if(levels ==5){
           break;
        }
        else if(levels ==6){
            System.out.println("\nTotal number of Elements jud ni nimo, gang:");
            five.stackElements();
        }
        else if(levels ==7){
            five.toDuplicate();
        }
        else if(levels ==8){
            System.out.println("\nMEET YOUR TOP! GUSTO MO YARN???:" + " " + five.peekTop());
            
        }
        else if(levels ==9){
            System.out.println("\nMEET YOUR BOTTOM! GUSTO MO YARN???" + " " + five.peekBottom());           
        }
        else if(levels ==10){
            System.out.println("\n BAG-ONG STACK COLLECTION:");
            five.addStack();
        }
        else if(levels ==11){
            five.newVerification();
        }
        else{
            System.out.println("\nBLIND KAAYO OIII!!!");
        }
       
    }
   
    }
}
