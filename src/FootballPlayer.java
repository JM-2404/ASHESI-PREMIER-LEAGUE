 //
  //
  //19/09/25


import java.util.Scanner;


public class FootballPlayer {
    public static void main(String[] args) {


        Scanner playerDetails = new Scanner(System.in);
        System.out.print("enter your name:");
        String name=playerDetails.nextLine();

        System.out.print("enter your age:");
        byte age= playerDetails.nextByte();

        System.out.print("your height:");
        float height= playerDetails.nextFloat();


        System.out.print("how much do you weigh:");
        float weight= playerDetails.nextFloat();

        System.out.print("Input your jersey number:");
        byte jerseyNumber= playerDetails.nextByte();

        System.out.println("Player's name-"+ name );
        System.out.println("Age-"+ age);
        System.out.println("Height-"+ height + "m");
        System.out.println("Weight-"+ weight +"lbs");
        System.out.println("Jersey Number-"+ jerseyNumber);
        System.out.println(" ");


        //task2
        final float POUND= 0.45359237f;
        final byte METER = 100;
        int  heightInCenti= (int) (METER * height) ;
        int weightInKilo= (int) (POUND * weight) ;
        System.out.println("Player's name-"+ name );
        System.out.println("Age-"+ age);
        System.out.println("Height in centimeters-"+ heightInCenti + "cm");
        System.out.println("Weight in kilograms-"+ weightInKilo +"kg");
        System.out.println("Jersey Number-"+ jerseyNumber);


        //task3
        System.out.println(" ");
        System.out.println("Current age is-"+ age);
        age++;
        jerseyNumber--;
        System.out.println("New age- "+ age);
        System.out.println("The new jersey number- " + jerseyNumber);


    }
}
