public class Fibonacci {

    // exercise 3. Recursive Nth Fibonacci Number
    static int fibonacciCalc(int num){
        if(num==0){
            return 0;
        }
        else if(num==1){
            return 1;
        }
        else{
            return fibonacciCalc(num-1)+fibonacciCalc(num-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacciCalc(5));
    }
    
}
