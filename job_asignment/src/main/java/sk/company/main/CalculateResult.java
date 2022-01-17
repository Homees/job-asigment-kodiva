package sk.company.main;

public class CalculateResult {

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
            } else {
                result.append(i).append("\n");
            }
        }

        return result.toString();
    }
}
