package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        for (int i = 10; i <= 20; i = i + 2){
            System.out.println("The count is " + i);
        }

        for (int i = 10; i <= 100; i = i * 10){
            System.out.println("The count is " + i);
        }

        for (int i = 1000; i <= 256000; i = i + 5000){
            System.out.println("The count is " + i);
        }

        for (int i = 11; i <= 12; i = i + 1){
            System.out.println("The count is " + i);
        }

        for (int i = 10; i >= 0; i = i - 2){
            System.out.println("The count is " + i);
        }

    
    } 
}