package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Double or single digit?");

        for (int i = 20; i >= 1; i = i - 1){
            if (i >= 10){
                System.out.println(i + " is a double digit");
            } else {
                System.out.println(i + " is a single digit");
            }
        }

        System.out.println("Nice!");

        for (int i = 0; i <= 5; i++){
            if (i == 0){
                System.out.println("Fast food");
            } else {
                System.out.println("Burgers");
                System.out.println("Fries");
            }
         }

         System.out.println("Nice!");
    }
}