public class SecondExercise
{
    public static void main(String[] args) {
        factorialForLoop(0);
    }

    public static int factorialForLoop(int N){
        if (N <= 0){
            System.err.println("The input value is invalid!");
            return 0;
        }
        int fact = 1;
        for(int i = 1; i <= N; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of " + N + " is: " + fact);
        return N;
    }
}

