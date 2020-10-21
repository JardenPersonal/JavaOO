import java.util.Arrays;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        Random random = new Random();


        for (int i = 0; i < 5; i++) {
            int n1 = random.nextInt(6) + 1;
            System.out.printf ("%d "  , n1);
            
        }
        System.out.println();

        for (int i = 0; i < 4 ; i++) {
            boolean b1 = random.nextBoolean();
            System.out.printf("%b " , b1);

        }
        System.out.println();


        for (int i = 0; i < 3 ; i++) {
            double max = 1.00;
            double min = 0.00;

            double n2;
            n2 = Math.random()  * (max - min);
            System.out.printf("%f " , n2);

        }

    }
}
