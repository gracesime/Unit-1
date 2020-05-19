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
        dog1.eyeColor = "brown";
        dog1.furColor = "brown, white, and black";
        dog1.furType = "short";

        dog2.name =  "Ruby";
        dog2.breed = "golden retriever";
        dog2.age = 3;
        dog2.eyeColor = "brown";
        dog2.furColor = "golden";
        dog2.furType = "medium";

        dog3.name = "Kota";
        dog3.breed = "husky";
        dog3.age = 7;
        dog3.eyeColor = "blue";
        dog3.furColor = "white and black";
        dog3.furType = "long";


        System.out.println("Dog number 1 is named " + dog1.name + " and he is a " + dog1.breed + ". He is " + dog1.age + " years old. His eyes are " + dog1.eyeColor + ", and his fur is " + dog1.furColor + " and " + dog1.furType + ".");
        System.out.println("Dog number 2 is named " + dog2.name + " and she is a " + dog2.breed + ". She is " + dog2.age + " years old. Her eyes are " + dog2.eyeColor + ", and her fur is " + dog2.furColor + " and " + dog2.furType + ".");
        System.out.println("Dog number 3 is named " + dog3.name + " and she is a " + dog3.breed + ". She is " + dog3.age + " years old. Her eyes are " + dog3.eyeColor + ", and her fur is " + dog3.furColor + " and " + dog3.furType + ".");

    }
}