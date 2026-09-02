import java.util. Scanner;

public class TwoDimArraySesson {
    public static void main (String [] args){
        String [][] sesons = {
            {"January", "Winter"},
            {"February", "Spring"},
            {"March", "Spring"},
            {"April", "Spring"},
            {"May", "Spring"},
            {"June", "Summer"},
            {"July", "Summer"},
            {"August", "Autum"},
            {"September", "Autum"},
            {"November", "Autum"},
            {"December", "Winter"},
        };

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = scnr.nextLine();

        boolean found = false;

        // search for the month in the first colum of the 2d array
        for (String[]row : sesons){    // for each row in the season matrix
            if(row[0].equalsIgnoreCase(month)){
                System.out.println(" The season for " + row[0] + " is " + row[1]);
                found = true;

            }
        }
        if(!found){
            System.out.println(month + " is not a month !");
        }
    }
}