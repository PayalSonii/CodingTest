package com.hsbc.reverser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        String inputFile = "src/main/resources/input.txt";
        String outputFile = "src/main/resources/output.txt";
       try {
            Path inputPath = Paths.get(inputFile);
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

            writeToFile(outputFile, lines);
        }catch (Exception e)
        {
            e.fillInStackTrace();
        }

    }

    private static void writeToFile(String outputFile, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            IAsciiReverse reverse = new AsciiReverseImpl();

            for (String line : lines) {
                writer.write(reverse.reverseContent(line));
                writer.newLine();
            }
        }
    }
}
