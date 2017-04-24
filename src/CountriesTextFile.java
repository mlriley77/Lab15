



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by MichaelRiley on 4/24/17.
 */
public class CountriesTextFile {


    public static void CreateFile(String fileString) {
        Path filePath = Paths.get(fileString);//strings above

        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("There was an error: " + e);
            }
        }
    }

    public static void WriteFile(Scanner s) {
        String userDecision = "y";



            System.out.println("Please enter a Country Name: ");
            String countryName = s.nextLine();

            Path filePath = Paths.get("countriesTextFile");
            File file = filePath.toFile();
            PrintWriter out = null;//initialize of PrintWriter
            try {

                out = new PrintWriter(new FileOutputStream(file, true));
                out.println(countryName);//re-assign
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }



    public static void ReadFile() {
        Path filePath = Paths.get("countriesTextFile");
        File file = filePath.toFile();

        try {
            FileReader r = new FileReader(file);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();

                while (line != null){
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}






