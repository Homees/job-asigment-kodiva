package sk.company.main;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintResult {

    private static final Logger logger = LoggerFactory.getLogger(PrintResult.class);

    public void printResults(String result) {
        try {
            String outputType = "console";

            // print to console
            if (outputType.equals("console")) {
                logger.info(result);
            }
            // print to file
            else if (outputType.equals("file")) {
                FileWriter myWriter = new FileWriter("exercise_output.txt");
                myWriter.write(result);
                myWriter.close();
                logger.info("Successfully wrote to the file.");
            } else {
                logger.info("Unknown output type.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
