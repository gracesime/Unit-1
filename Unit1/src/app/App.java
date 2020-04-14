package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";
        boolean mnIsCold = true; 


        while (count <= 10) {
            System.out.println("The count is " + count);
            count = count + 1;
        }

        System.out.println("count finished");

        while (color == "red"){
            System.out.println("The color is " + color);
            color = "green";
        }

        System.out.println("color finished");

        while (mnIsCold == true) {
            System.out.println("Minnesota is cold: " + mnIsCold);
            mnIsCold = false;
        }

        System.out.println("mnIsCold finished");


    
    } 
}