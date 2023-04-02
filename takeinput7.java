import java.util.Scanner;

public class takeinput7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
            
        
        /*
         * if you only want integer to be scanned than user the line 
         * Scanner scn = new Scanner (System.in);
         * int n = scn.nextInt();
         * 
         * but if you want to scan a integer and a string  at the same line than use this
         * Scanner scn = new Scanner (system.in);
         * int n = integer.parseInt(scn.nextLine());
         * String name = scn.nextLine();
         *  
         */

        System.out.print("Dear " + name + " here is the counting\n");
        for (int i =1; i <= n; i++){
            System.out.println(i);
        }

    }
}
