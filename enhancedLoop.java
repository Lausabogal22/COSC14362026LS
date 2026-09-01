public class enhancedLoop {
    public static void main (String []args){
        int [] array = {-7, 11, 42, 80};
        int sum = 0;

        for (int element : array){
            sum += element;

        }
        System.out.println(" the sum is " + sum);

    }
}