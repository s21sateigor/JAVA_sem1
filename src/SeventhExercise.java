public class SeventhExercise
{
    public static void main(String[] args) {
        int n = 4, i, j;
        SeventhExercise s = new SeventhExercise();
        for(i = 0; i <= n; i++){
            for(j = 0; j <= n - i; j++){
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++){
                System.out.print(" " + s.factorial(i) / (s.factorial(i - j) * s.factorial(j)));
            }
            System.out.println();
        }
    }

    public int factorial(int i){
        if (i == 0){
            return 1;
        }
        return i * factorial(i - 1);
    }

}
