public class TwodimArray {
    public static void main (String [] args){
        // create a dimensional array grade
        int[][] grades = {{7,8},{10,9},{9,7}};
        //print row index 2, column index 1
        System.out.println(grades[2][1]);


        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 2 ; j++){
                System.out.println(grades [i][j] + " ");
            } 
            System.out.println();
        }
    }
}