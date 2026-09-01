import java.util.Scanner;

public class App {
    public static void main (String [] args){
        
        double [] array = {-1.5, 2.5, 3.5, 4.1, 5.8};

        for (int i =0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }

        String [] names =  new String [5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five names");

        for(int i =0 ; i < 5 ; i++){
            names[i] = input.nextLine();
        }

        System.out.println("The names that you entrada are: ");
        for(int i =0 ; i < 5 ; i++){
            System.out.print(names[i] + " ");
        }
    }
}

