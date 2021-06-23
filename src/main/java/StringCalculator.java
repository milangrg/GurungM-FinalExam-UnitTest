public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int result = Integer.parseInt(number.trim());
                if (result < 0) {
                    throw new IllegalArgumentException();
                } else if (result > 1000) {
                    continue;
                } else {
                    returnValue += Integer.parseInt(number.trim());
                }
            }
        }
        return returnValue;
    }
}