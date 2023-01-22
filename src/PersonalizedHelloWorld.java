import java.util.Scanner;
public class PersonalizedHelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        do {
            System.out.println("What is your name?");
            name = scan.nextLine();


        } while (name.isEmpty());
        System.out.println("Hello, " + name + "!");
    }
}