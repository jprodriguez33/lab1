import java.util.Scanner;
public class PersonalizedHelloWorld {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");

    String name = scan.nextLine();


        System.out.println("Hello, "+name+"!");
    }
}