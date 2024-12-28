public class SumCalc {

    //exercise 2. Recursive Sum from 1 to N

    static int sumCalc(int num){
        if(num<=1){
            return 1;
        } else {
            return sumCalc(num-1)+num;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(sumCalc(4));
    }
    
}
