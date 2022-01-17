package sk.company.main;

import org.apache.log4j.BasicConfigurator;

public class Application {

    public static void main(String[] args) {
        // try (InputStream input = Application.class.getClassLoader().getResourceAsStream("config.properties")) {
        // Properties prop = new Properties();
        // if (input == null) {
        // System.out.println("Sorry, unable to find config.properties");
        // return;
        // }
        // load a properties file from class path, inside static method
        // prop.load(input);
        // convert potential input argument to list for easier validation
        // List<String> argList = Arrays.asList(args);
        // String inputValueString = !argList.isEmpty() ? argList.get(0) : prop.getProperty("output.length");
        // String outputType = !argList.isEmpty() ? argList.get(1) : prop.getProperty("output.type");
        // int inputValue = Integer.parseInt(inputValueString);
        // Application mainClass = new Application();
        // String result = CalculateResult.buildResult(inputValue);

        BasicConfigurator.configure();
        CalculateResult calculator = new CalculateResult();
        PrintResult printer = new PrintResult();

        String result = calculator.buildResult(100);
        printer.printResults(result);
    }
}
