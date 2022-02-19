import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double currentTank = 0;
        double milesPerGallon = 0;
        double gallonPrice = 0;
        double currentTankDistance = 0;
        double hundredMilesCost = 0;
        String trash;

        System.out.println("Enter number of gallons of gas in your tank: ");

        if(in.hasNextDouble())
        {
            currentTank = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Rerun the program and enter a valid number of gallons");
            System.exit(0);
        }

        System.out.println("Enter fuel efficiency in miles per gallon: ");

        if(in.hasNextDouble())
        {
            milesPerGallon = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Rerun the program and enter a valid number of miles");
            System.exit(0);
        }

        System.out.println("Enter price per gallon: ");

        if(in.hasNextDouble())
        {
            gallonPrice = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Rerun the program and enter a valid number for price");
            System.exit(0);
        }

        currentTankDistance = currentTank * milesPerGallon;
        hundredMilesCost = (100 / milesPerGallon) * gallonPrice;

        System.out.println("You can travel " + currentTankDistance + " miles with your current tank and it costs $" + hundredMilesCost + " per 100 miles");
    }
}
