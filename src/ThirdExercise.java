import java.util.Arrays;


public class ThirdExercise
{
    public static void main(String[] args) {
        System.out.print("Generated array: ");
        double[] array = generateArray(5, 1, 20);
        System.out.print("Sorted array: ");
        arraySort(array);
        getMin(array);
        getMax(array);
        getMean(array);
    }

    public static double[] generateArray(int N, double lower, double upper){
        double[] array = new double[N];
        for(int i = 0; i < N; i++){
            array[i] = lower + (Math.random() * ((upper - lower) + 1));
        }
        System.out.println(Arrays.toString(array));
        return array;

    }
    public static double getMean(double[] array){
        double average = 0;
        for(int i = 0; i < array.length; i++){
            average = average + array[i];
        }
        average = average / array.length;
        System.out.println("The average value of the array is: " + average);
        return average;
    }
    public static double getMin(double[] array){
        double min = array[0];
        System.out.println("The minimum value of the array is: " + min);
        return min;
    }
    public static double getMax(double[] array){
        double max = array[array.length - 1];
        System.out.println("The maximum value of the array is: " + max);
        return max;
    }
    public static double[] arraySort(double[] array){

        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j-1] > array[j]){
                    double temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
