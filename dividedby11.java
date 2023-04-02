import java.util.Scanner;

public class dividedby11 {

    public static void name(String [] args) {

        int divisor = 11;
        Scanner scn = new Scanner(System.in);
        int dividend = scn.nextInt();
           
        int remainder = dividend % divisor;
           
        System.out.println("Remainder: " + remainder);
   
        
    }
    
}
