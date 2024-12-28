public class GCD {
// exercise 7. Recursive GCD of Two Numbers
    static int calcGCD(int num1, int num2){
        int ans = 0;
        if(num2==0){
            ans = num1;
            return ans;
        } else {
            ans = calcGCD(num2, num1%num2);
            return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcGCD(88, 6));
    }
    
}
