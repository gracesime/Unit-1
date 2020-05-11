package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number.");
        int number1 = input.nextInt();

        System.out.println("Please enter the second number.");
        int number2 = input.nextInt();

        System.out.println("Press 1 to add, 2 to subtract, 3 to multiply, or 4 to divide.");
        int operation = input.nextInt();
        if (operation == 1){
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        }
        if (operation == 2){
            System.out.println(number1 + " - " + number2 + " = " + (number1 + number2));
        }
        if (operation == 3){
            System.out.println(number1 + " * " + number2 + " = "+ (number1 * number2));
        }
        if (operation == 4){
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        }
       



        

       

      


    }
}