
import java.util.Scanner;
import java.util.stream.IntStream;

public class GuessMyNumber {
    public static int BinarySearch(int[] array, int first, int Subn) {
        Scanner scan = new Scanner(System.in);
        String response;

            int mid = (first+Subn)/2;

            System.out.println("INSTRUCTIONS: Please enter C for correct, H for too high, or L for too low.");
            System.out.println(">Is your number "+ mid +"?<");
            System.out.println("Enter your response (H/L/C) :");

            response = scan.nextLine();
        do {


            if (response.equals("L")) {
                first = mid + 1;
            }
            if (response.equals("H")) {
                Subn = mid - 1;
            }
            if (response.equals("C")) {
                System.out.println("Your number is " + mid + "!");

            }
        }while(response != "C");

        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;
        int Subn;

            System.out.println("Please input a number: ");
            n = scan.nextInt();

        if (n>0) {

            int[] array = IntStream.rangeClosed(0, n).toArray();

            Subn = n - 1;

            System.out.println("++++++++++++++++++++++++++++\nWelcome to Guess My Number! " +
                    "\nPlease think of a number between 0 and " + Subn + "\n++++++++++++++++++++++++++++");

            int result = BinarySearch(array, 0, Subn);
        }
        else {

            System.out.println("Please enter a positive number: ");
            n = scan.nextInt();

            int[] array = IntStream.rangeClosed(0, n).toArray();

            Subn = n - 1;

            System.out.println("++++++++++++++++++++++++++++\nWelcome to Guess My Number! " +
                    "\nPlease think of a number between 0 and " + Subn + "\n++++++++++++++++++++++++++++");

            int result = BinarySearch(array, 0, Subn);

        }

    }
}
