public class FirstExercise
{
    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("Pos in " + fallingTime + "sec :" + finalPosition);

        positionCalc(-9.81, 5, 0, 5);
        System.out.println(positionCalc(-9.81, 5, 0, 5));
    }

    public static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime){
        double result = 0.5 * (gravity * (fallingTime * fallingTime)) + (initialVelocity * fallingTime) + initialPosition;
        return result;
    }


}
