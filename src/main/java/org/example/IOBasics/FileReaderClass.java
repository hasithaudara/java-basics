package org.example.IOBasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderClass {
    private final String INPUT_FILE_PATH = "C:\\Users\\HasithaBombuwala\\OneDrive - ConceptVines\\Documents\\Lentra\\java-basics\\src\\main\\java\\org\\example\\Items.csv";
    private final String OUTPUT_FILE_PATH = "C:\\Users\\HasithaBombuwala\\OneDrive - ConceptVines\\Documents\\Lentra\\java-basics\\src\\main\\java\\org\\example\\result.txt";

    public static void main(String[] args) {
        FileReaderClass exampleClass = new FileReaderClass();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(exampleClass.INPUT_FILE_PATH));
             FileWriter outputFileWriter = new FileWriter(exampleClass.OUTPUT_FILE_PATH);) {
            int total = 0;
            String line = null;
            List<String> readLines = new ArrayList<>();

            while ((line = fileReader.readLine()) != null) {
                readLines.add(line);
                String lineValue = (line != null) ? line.split(",")[1] : "0";
                total += Integer.parseInt(lineValue);
            }

            //
            for (String item : readLines) {
                outputFileWriter.write(item + System.lineSeparator());
            }
            outputFileWriter.write(System.lineSeparator());
            outputFileWriter.write("Total value of the items : " + total);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
