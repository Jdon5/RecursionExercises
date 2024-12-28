public class factorialCalc {
    // recursive factorial calculation  exercise1
    
    static int factorial(int num){
        if(num <= 0) return 1;
        else 
        return factorial(num-1)*num;
    }
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
    }
}
