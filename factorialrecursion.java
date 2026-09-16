public class factorialrecursion{
    public static void main (String []args){

       System.out.println(factorial(3)) ;
       System.out.println(s(4));
       System.out.println(m(4,3));



    }
    public static int factorial(int n){
        if (n < 2) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int s (int n){
        if(n==0){
            return 0;
        }

        return s(n-1)+n;
    }

    public static int m (int a , int b){
        if(b == 0 ){
            return 0 ;
        }

        return m(a,b-1)+a;
    }
}