package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("How many states are in the U.S.?");
        int states = input.nextInt();
         if (states == 50){
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }

       System.out.println("What year did the Cold War end?");
       int coldWar = input.nextInt();
         if (coldWar == 1991){
        System.out.println("CORRECT");
        } else {
        System.out.println("INCORRECT");
        }

        System.out.println("How many continents are there?");
        int continents = input.nextInt();
         if (continents == 7){
            System.out.println("CORRECT");
         } else {
             System.out.println("INCORRECT");
         }



        

       

      


    }
}