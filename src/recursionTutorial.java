public class recursionTutorial {

    static void walk(int steps){
        if(steps < 1) // base case
        return; 
        else
        System.out.println("You take a step!");
        walk(steps-1); // recursive 
    }

    static int factorial(int num){
        if(num<1) return 1;// base case
        return num* factorial(num-1);//recursive
    }


    public static void main(String[] args) {
        //walk(5);
        System.out.println(factorial(5));
        
    }
}

