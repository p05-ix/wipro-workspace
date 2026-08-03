// FileCopyDemo.java
import java.io.*;
import java.util.Scanner;

public class FileCopyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the input file name:");
            String inputFile = sc.nextLine();

            System.out.println("Enter the output file name:");
            String outputFile = sc.nextLine();

            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);

            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }

            fr.close();
            fw.close();

            System.out.println("File is copied.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
