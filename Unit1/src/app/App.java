package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Scanner input = new Scanner(System.in);
        
        dog1.name = "Henry";
        dog1.breed = "basset hound";
        dog1.age = 12;

        dog2.name =  "Ruby";
        dog2.breed = "golden retriever";
        dog2.age = 3;

        dog3.name = "Kota";
        dog3.breed = "husky";
        dog3.age = 7;


        System.out.println("Dog number 1 is named " + dog1.name + " and he is a " + dog1.breed + ". He is " + dog1.age + " years old.");
        System.out.println("Dog number 2 is named " + dog2.name + " and she is a " + dog2.breed + ". She is " + dog2.age + " years old.");
        System.out.println("Dog number 3 is named " + dog3.name + " and she is a " + dog3.breed + ". She is " + dog3.age + " years old.");

    }
}