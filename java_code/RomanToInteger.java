import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with your Roman numeral

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value of " + romanNumeral + " is: " + result);
    }

    public static int romanToInteger(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            // Get the numeric value of the current Roman numeral
            int currentValue = romanValues.get(s.charAt(i));
         // If the current value is greater or equal to the previous value, add it to the result
            if (currentValue >= prevValue) {
                result += currentValue;
            }
            // Otherwise, subtract it from the result
            else {
                result -= currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        return result;
    }
}
