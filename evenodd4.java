

public class evenodd4 {
    public static void main (String arg[]) {

        int x = 11;
        if ( x % 2 == 0) {
            System.out.println ("x is even");
        } 
        else {
            System.out.print ("x is odd");
        }

        System.out.println ("\nThis is a basic if else program\n");

        int n1 = 10;
        int n2 = 20;

        if(n1 == n2) {
            System.out.println (n1 +" is equal to "+ n2);
        }

        else {

            if(n1 > n2) {
                System.out.println(n1 +" is greater than "+ n2);
            }

            else {
                System.out.println(n1 +" is smaller than " + n2);
            }

        }

        System.out.println("\nThis is another program using if, else ,if & else\n");

        int n3 = 10;
        int n4 = 10;

        if(n3 == n4) {
            System.out.println(n3 +" is equal to " + n4);
        }

        else if (n3 > n4) {
            System.out.println(n3 +" is greater than "+ n4);
        }

        else {
            System.out.println(n3 +" is smaller than "+ n4);
        }

        System.out.print("\nThis is the same program as above with different apporach using if, esle if & esle function\n");



    }
    
}
