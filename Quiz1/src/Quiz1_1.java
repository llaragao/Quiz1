import java.util.Scanner;

public class Quiz1_1 {

    public static class FizzBuzz {

        public static void main(String[] args) {

            System.out.println("Hello there! Insert a number (1 to 100): ");

            Scanner getNumber = new Scanner(System.in);

            int userNumber = getNumber.nextInt();
            int counter = 0;
            int number = 0;

            for (number = 1; number <= userNumber; number++) {
                String resultLine = "";
                if ((number % 15) == 0) {
                    resultLine = resultLine + "FizzBuzz";
                } else if ((number % 3) == 0) {
                    resultLine = resultLine + "Fizz";
                } else if ((number % 5) == 0) {
                    resultLine = resultLine + "Buzz";
                } else
                    resultLine = Integer.toString(number);

                System.out.print(resultLine + " ");

                counter++;

                if (counter == 20) {
                    counter = 0;
                    System.out.println();
                }
            }
        }
    }
}
