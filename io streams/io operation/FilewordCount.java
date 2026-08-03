// FileWordCount.java
import java.io.*;
import java.util.*;

public class FileWordCount {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try {
            // Read words from input file
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            Map<String, Integer> wordCount = new TreeMap<>(); // TreeMap keeps keys sorted

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // split by whitespace
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            br.close();

            // Write results to output file
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }
            bw.close();

            System.out.println("Word counts written to " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
