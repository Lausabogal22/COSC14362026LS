public class findMax
public static void main (String [] args){

    double [][] values = {
     {0.01, 0.06,0.098},
     {0.087, 0.15,0.999,0.76},
     {0.099,0.01}
     };

    // Excercise converte the following nested loop into
    //two enhanced for loops
    // find de max 

    double  max = values[0][0];
    for (int i = 0 ; i  < values.length; i++){
    for (int j = 0 ; i < values[i].length; j++){
        if(values [i][j] > max) {
            max = values[i][j];
        }
    }
}
 double maxi = values [0][0];
 for(double[]row : values){
    for (double element : rows) {
        if(values [i][j] > max) {
            max = values[i][j];
        }
    }
 }
System.out.println("The max is " +  max);
}
