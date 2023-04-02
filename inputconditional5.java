import java.util.Scanner;

public class inputconditional5 {
    public static void main (String args[]) {
        // input   
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();


        if (marks > 90) {
            System.out.println("Excellent");

        }

        else if (marks > 80 ) {
            System.out.println("Fair");

        }

        else if (marks > 70) {
            System.out.println("Meet Expectation");

        }

        else if (marks > 60 ) {
            System.out.println("Below Par");
        }

        else {
            System.out.println("Need More Practice");
        }




    }
}
