
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        String fullName;
        System.out.println("Let us know your name: ");
        Scanner input = new Scanner(System.in);
        fullName = input.next();
        System.out.println("And your age as well please: ");
        age = input.nextInt();

        if (age >= 16 && age <= 25 || age >= 26 && age <= 30 || age >= 60) {
            System.out.println("You are eligible for a Railcard");
        }
        else {
            System.out.println(fullName + " You are not eligible for a Railcard based on your age, however you should check our website for other offers");
        }

    }
}
