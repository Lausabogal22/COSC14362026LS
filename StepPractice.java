import java.util.Scanner;

public class StepPractice {

    public static double stepsToMiles (int steps){
        if (steps <= 0 ){
            throw new IllegalArgumentException("Number of steps have to be positive ");
        }
        return steps/2000.0;
    }

    public static void main (String [] args) {
        Scannner in = new Scanner(  System.in);

        try{
            System.out.printnl("Enter your step count");
            String steps = in.nextLine();
            int steps = Integer.parseInt(text) ;
            double miles = stepsToMiles(steps);

            if (steps > 0){
                System.out.println(steps + " is equivalent to " + miles);
            }

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage);

        }
    }
            
        


  // https://github.com/copperx/1437-exceptions-2/blob/main/StepPractice.java


    
}