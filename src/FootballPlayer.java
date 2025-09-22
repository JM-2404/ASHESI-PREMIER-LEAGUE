 //Janice NutiFafa Middleton-Dogbe
 //33072028
 //Ashesi Premier League
 //19/09/25


import java.util.Scanner;


public class FootballPlayer {
    public static void main(String[] args) {

        //task 1
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

        //task4
        System.out.println(" ");
        boolean isEligible = (age >= 18) && (age <= 35) && (weight < 90);
        if (isEligible) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not eligible");
        }

        if ((age<18) || (weight >= 90)) {
            System.out.println("Player has a problem, either too young or too heavy");
        }

        boolean notEligible = !(age >= 18 && age <= 35 && weight < 90);
        if (notEligible) {
            System.out.println("Not Eligible");
        }

        byte age1=25;
        byte weight1=75;
        boolean isEligible1= (age >= 18) && (age <= 35) && (weight < 90);
        boolean notEligible1 = !(age >= 18 && age <= 35 && weight < 90);



        //task 5
        if (age<20) {
            System.out.println("Rising Star");
        }else if (age<=30) {
            System.out.println("Prime Player");
        }else {
            System.out.println("veteran");
        }

        //task 6
        System.out.println(" ");
        System.out.println("Enter your jersey number:");
        byte jerseyNumber1= playerDetails.nextByte();

        switch (jerseyNumber1)
            {
            case 1:
                System.out.println("Goalkeeper");
                break;
                case 2:
                    System.out.println("Defender");
                    break;
                    case 3:
                case 4:
                case 5:
                    System.out.println("Defender");
                    case 6:
                        System.out.println("midfielder");
                        break;
                case 7:
                    System.out.println("Winger");
                    break;
                case 8:
                    System.out.println("Midfielder");
                case 9:
                    System.out.println("Striker");
                    break;
                case 10:
                    System.out.println("Playmaker");
                    break;
                    case 11:
                        System.out.println("Winger");
                default:
                        System.out.println("Player position not found");
            }

        //task 7
        System.out.println(" ");

        switch (jerseyNumber) {
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
                System.out.println("Defender");
            case 3:
            case 4:
                case 5:
                    System.out.println("Defender");
                break;
                case 6:
                    System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
            case 8:
                System.out.println("Midfielder");
                break;
                case 9:
                    System.out.println("Striker");
                    break;
            case 10:
                System.out.println("Playmaker");
                break;
                case 11:
                    System.out.println("Winger");
                    break;
            default:
                System.out.println("Player position not found");
        }
        //task 7b
        System.out.println(" ");
        switch (jerseyNumber1)
        {
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2,5:
                System.out.println("Defender");
                break;
            case 3:
            case 4:
            case 6,8:
                System.out.println("Midfielder");
                break;
            case 7,11:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            default:
                System.out.println("Player position not found");
        }


        //task8
        System.out.println(" ");
        System.out.println("What category are you in for the game:");
        String category= playerDetails.nextLine();
        System.out.println("What is your weight:");
        float weight2= playerDetails.nextFloat();


        if (category.equals("Prime Player")) {
            if (weight < 80) {
                System.out.println("Selected for Starting Lineup");
            } else {
                System.out.println("Benched");
            }
        } else {
            System.out.println("Benched");
        }

        //task 9
        System.out.println(" ");
        byte age2 = 28;
        System.out.println("What is your fitness score:");
        int fitnessScore= playerDetails.nextInt();

        String status = (age < 30 && fitnessScore > 70) ? "Play" : "Rest";
        System.out.println("Final Status: " + status);
    }





}











