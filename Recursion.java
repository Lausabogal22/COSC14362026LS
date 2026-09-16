public class Recursion {
    public static void main (String [] args){
     System.out.println("Banana");
     a();
     System.out.println("Watermelon");
    }

    public static void a (){
        System.out.println("Mango");
        b();
         System.out.println("Watermelon");
    }
    public static void b(){
         System.out.println("Guava");

    }
}