import java.util.ArrayList;
import java.util.List;

public class IntegerSumCalculator {
    
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num; // Unboxing happens here
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        String[] inputs = {"10", "20", "30", "40", "50"}; // Test Case 1
        
        for (String input : inputs) {
            Integer num = parseStringToInteger(input);
            if (num != null) {
                numbers.add(num); // Autoboxing happens here
            }
        }
        
        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);
    }
}
