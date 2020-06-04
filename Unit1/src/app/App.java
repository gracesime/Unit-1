package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);
        

        System.out.println("What is your name?");
        String user = input.nextLine();

        System.out.println("How much money are you starting with?");
        int b = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a password.");
        String pass = input.nextLine();

        System.out.println("Account created. Please log in.");

        System.out.println("Enter your name.");
        String inputUser = input.nextLine();

        System.out.println("Enter your password.");
        String inputPass = input.nextLine();
        if (inputUser.equals(user) && inputPass.equals(pass)){
            System.out.println("Access granted. Welcome " + user + ".");
        } else {
            System.out.println("Access denied. Invalid username or password.");
            System.exit(0);
        }

        System.out.println("What would you like to do? Press 1 to check balance; press 2 to withdraw money; press 3 to change password.");
        int n = input.nextInt();
        input.nextLine();
        if (n == 1){
            System.out.println("Your balance is " + b + ".");
        }
        if (n == 2){
            System.out.println("How much do you want to withdraw?");
                int w = input.nextInt();
                input.nextLine();
                if (w <= b){
                    System.out.println("You withdrew " + w + " dollars. Your new balance is " + (b - w) + ".");
                } else {
                    System.out.println("You have exceeded your current balance of " + b + ". Withdrawal unsuccessful.");
                }
        }
        if (n == 3){
            System.out.println("Please enter your existing password");
            String resetPass = input.nextLine();
                if (resetPass.equals(pass)){
                    System.out.println("Please enter your new password");
                     String newPass = input.nextLine();
                     pass = newPass;
                    System.out.println("Password changed");
                }

     }
       

        

        


       

    }
}