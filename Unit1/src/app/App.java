package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your password.");
        String enteredPassword = input.nextLine();
        if (enteredPassword.equals("183726073")){
            System.out.println("ACCESS GRANTED");
        } else {
            System.out.println("ACCESS DENIED");
        }

       

      


    }
}