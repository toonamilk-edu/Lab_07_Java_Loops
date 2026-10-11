import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {

        Random generator = new Random();
        boolean done = false;
        int roll = 0;

        System.out.printf("%6s %6s %6s %6s %6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------");

        do {
            roll = roll + 1;
            int D1 = generator.nextInt(6) + 1;
            int D2 = generator.nextInt(6) + 1;
            int D3 = generator.nextInt(6) + 1;
            int sum = D1 + D2 + D3;
            System.out.printf("%6d %6d %6d %6d %6d%n", roll, D1, D2, D3, sum);

            if (D1 == D2 && D2 == D3) {
                System.out.println("You rolled a triple!");
                done = true;
            }
        } while (!done);
    }
}