import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner userInput = new Scanner(System.in);

        // Print out a prompt
        System.out.println("Please enter the string: ");
        // Store the string into a variable
        String userString = userInput.nextLine();
        // Print out another prompt
        System.out.println("Please enter the integer: ");
        // Store the integer into a variable
        int userInteger = userInput.nextInt();

        printStringIntegerAmountOfTimes(userString, userInteger);

    }

    public static void printStringIntegerAmountOfTimes(String userString, int userInteger)
    {
        for (int i = 1; i <= userInteger; i++)
        {
            System.out.println(userString);
        }

    }
}
