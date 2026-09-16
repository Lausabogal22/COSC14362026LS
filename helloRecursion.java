public class helloRecursion {
    public static void main (String [] args){
        sayHello(3);
    }

    public static void  sayHello(int times){
        
        
        if(times>0){
            System.out.println("Hello");
            sayHello(times-1);
        }    
    }
}