 public class LoopException {
    public static void main (String [] args){
       // Exercise : make it keep asking until the user types a 
       // whole number, then print the result once, after the loop

       Scanner in =  new Scanner (System.in);
       boolen valid = false;
       

        while (!valid){
            System.out.println("How old are you ?");
            String input = in.nextLine();
            try {
                    int age = Integer.ParseInt(input);
                    valid = true;
                    System.out.print("Next year you will be " + (age + 1) + " years");
                    
            }catch (NumberFormatException e){
                System.println(" thats not a whole number");
            }
        }

    }
 }