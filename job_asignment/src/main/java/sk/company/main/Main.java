package sk.company.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Main {

    // method to build string with all the values
    public String buildResult(int inputValue) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= inputValue; i++) {
            // if value is divisible by 4 then it is also divisible by 2
            if (i % 2 == 0) {
                result.append("foo\n");

                if (i % 4 == 0) {
                    result.append("fuu\n");
                }
            }
            else {
                result.append(i).append("\n");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            // load a properties file from class path, inside static method
            prop.load(input);

            // convert potential input argument to list for easier validation
            List<String> argList = Arrays.asList(args);
            String inputValueString = !argList.isEmpty() ? argList.get(0) : prop.getProperty("output.length");
            String outputType = !argList.isEmpty() ? argList.get(1) : prop.getProperty("output.type");
            int inputValue = Integer.parseInt(inputValueString);
            Main mainClass = new Main();

            String result = mainClass.buildResult(inputValue);

            // print to console
            if (outputType.equals("console")) {
                System.out.println(result);
            }
            // print to file
            else if (outputType.equals("file")) {
                FileWriter myWriter = new FileWriter("exercise_output.txt");
                myWriter.write(result);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
            else {
                System.out.println("Unknown output type.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
