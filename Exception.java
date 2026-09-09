import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception {
    public static void main (String [] args){

        Scanner in = new Scanner (System.in);
        System.out.print("Enter you age: ");

        try {
            int age = in.nextInt();
             System.out.println("Next year you will be " + (age +1) + " years");

        } catch (InputMismatchException e ){ 
            System.out.println("Thats not a number , try again");
            System.out.println("here's the stack trace :");
            e.printStackTrace();
        }
        
       


    }
}