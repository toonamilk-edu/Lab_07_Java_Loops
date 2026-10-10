public class Task_6 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row = row + 1) {
            for (int column = 1; column <= row; column = column + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}