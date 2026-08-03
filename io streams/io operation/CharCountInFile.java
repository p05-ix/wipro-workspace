// CharCountInFile.java
import java.io.*;
import java.util.Scanner;

public class CharCountInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the file name:");
            String fileName = sc.nextLine();

            System.out.println("Enter the character to be counted:");
            char ch = sc.nextLine().charAt(0);

            int count = 0;
            FileReader fr = new FileReader(fileName);
            int i;

            while ((i = fr.read()) != -1) {
                char current = Character.toLowerCase((char) i);
                if (current == Character.toLowerCase(ch)) {
                    count++;
                }
            }
            fr.close();

            System.out.println("File '" + fileName + "' has " + count +
                               " instances of letter '" + ch + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

