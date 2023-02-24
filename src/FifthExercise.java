public class FifthExercise
{
    public static void main(String[] args) {
        coinFlip(4);
        rollDice(4);
        roll2Dices();
    }

    public static double[] coinFlip(int N){
        int heads = 0;
        int tails = 0;
        int counter = 1;
        while(counter <= N){
            if(Math.random() < 0.5) {
                heads++;
                System.out.println("Heads won!");
            } else {
                tails++;
                System.out.println("Tails won!");
            }
            counter++;
        }
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);
        System.out.println();
        System.out.println("-------------");
        return new double[0];
    }

    public static int[] rollDice(int N){

        int first = 0, second = 0 , third = 0, fourth = 0, fifth = 0, sixth = 0;
        for(int i = 1; i <= N; i++){
            int dice = (int)(Math.random()*6) + 1;
            System.out.println("The result of rolling dice is: " + dice);
            switch(dice){
                case 1:
                    first++;
                    break;
                case 2:
                    second++;
                    break;
                case 3:
                    third++;
                    break;
                case 4:
                    fourth++;
                    break;
                case 5:
                    fifth++;
                    break;
                case 6:
                    sixth++;
                    break;
            }

        }
        System.out.println("Number of occurrences: ");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
        System.out.println("Fourth: " + fourth);
        System.out.println("Fifth: " + fifth);
        System.out.println("Sixth: " + sixth);
        System.out.println();
        System.out.println("----------");
        return new int[0];
    }

    public static int roll2Dices(){
        int sum = 0;
        int tries = 0;
        while(sum < 12){
            int dice1 = (int)(Math.random()*6) + 1;
            System.out.println("The result of rolling first dice is: " + dice1);
            int dice2 = (int)(Math.random()*6) + 1;
            System.out.println("The result of rolling second dice is: " + dice2);
            sum = dice1 + dice2;
            tries++;
        }
        System.out.println("The number of tries is: " + tries);
        return 0;
}
}


