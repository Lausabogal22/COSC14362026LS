import java.util.Scanner;

public class predict {
 public static void main (String [] args ){

    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    try{
        System.out.print("A");
        System.out.print("B");
        int age = Integer.ParseInt(input);
        System.out.print("C");

    }catch (NumberFormatException e){
        System.out.println("D");
    }finally {
        System.out.println("E");   
    }
    System.out.println("F");
 }
}