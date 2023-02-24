import java.util.Arrays;
import java.util.Random;
public class ForthExercise
{
    public static void main(String[] args) {
        int[][] twoDArray = generateMatrix(4);
        getProduct(twoDArray, 3,1);
    }
    public static int[][] generateMatrix(int N){
        int[][] array = new int[N][N];
//        Random random = new Random();
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                array[i][j] = random.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(array));
//        return array;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * N);
            }
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(array));
        return array;
    }
    public static int getProduct(int[][] matrix, int i, int j){
        System.out.println("The specified product is: " + matrix[i][j]);
        return matrix[i][j];
    }

}
