package lesson10.files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInputOutput {

    public static ArrayList<String> readFromFile(String filename) {

        ArrayList<String> textReadFromFile = new ArrayList<>();

        try (Scanner inputScanner = new Scanner(new BufferedReader(new FileReader(filename)))) {

            while (inputScanner.hasNext()) {
                textReadFromFile.add(inputScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        }
        return textReadFromFile;
    }

    public static void writeToFile(String fileName, ArrayList<String> listOfStrings) {

        try (PrintWriter output = new PrintWriter(new FileWriter(fileName))) {
            listOfStrings.forEach(output::println);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        }
    }
}
