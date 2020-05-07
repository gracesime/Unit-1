package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a name.");
        String name1 = input.nextLine();

        System.out.println("Please enter a name.");
        String name2 = input.nextLine();

        System.out.println("Please enter an verb.");
        String verb1 = input.nextLine();

        System.out.println("Please enter a place.");
        String place1 = input.nextLine();

        System.out.println("Please enter an adjective");
        String adjective1 = input.nextLine();

        System.out.println("Please enter a noun.");
        String noun1 = input.nextLine();

        System.out.println("Please enter a past-tense verb.");
        String verb2 = input.nextLine();

        System.out.println("Please enter a verb.");
        String verb3 = input.nextLine();

        System.out.println("Please enter a food");
        String food1 = input.nextLine();

        System.out.println("Please enter an adjective");
        String adjective2 = input.nextLine();
        
        System.out.println("One day, " + name1 + " and " + name2 + " were bored.");
        System.out.println("They decided to " + verb1 + " to the " + place1 + ".");
        System.out.println("When they got there, they saw a " + adjective1 + " " + noun1 + ".");
        System.out.println("They went to get a closer look, but it " + verb2 + ".");
        System.out.println("After that experience, they decided to " + verb3 + " home.");
        System.out.println("Once home, they ate " + food1 + " while reflecting on a very " + adjective2 + " day.");


        

       

      


    }
}