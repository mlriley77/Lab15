import java.util.Scanner;

/**
 * Created by MichaelRiley on 4/24/17.
 */
public class CountriesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        String userDecision = "y";

        String fileString = "countriesTextFile";
        CountriesTextFile.CreateFile(fileString);

        System.out.println("Welcome to the Countries Maintenance Application!");
        while (userDecision.equalsIgnoreCase("y")){

            System.out.println("1 - See the list of countries: ");
            System.out.println("2 - Add a country: ");
            System.out.println("3 - Exit");
            userInput = scan.nextInt();
            if (userInput == 1) {
                scan.nextLine();
                CountriesTextFile.ReadFile();
            } else if (userInput == 2) {
                scan.nextLine();
                CountriesTextFile.WriteFile((scan));
            } else if (userInput == 3) {
                scan.nextLine();
                System.out.println("Goodbye");
            }
            System.out.println("Do you want to start over: (y/n)");
            userDecision = scan.nextLine();

            if ((userDecision.equalsIgnoreCase("n"))) {
                System.out.println("goodbye!");

            }

        }










    }

}
