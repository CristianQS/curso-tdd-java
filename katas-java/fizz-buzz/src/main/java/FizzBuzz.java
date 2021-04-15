import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> ConvertToFizzBuzz() {
        var listOfFizzBuzz = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            if (isFizz(i)) {
                listOfFizzBuzz.add("Fizz");
            } else if (isBuzz(i)) {
                listOfFizzBuzz.add("Buzz");
            } else {
                listOfFizzBuzz.add(String.valueOf(i));
            }
        }
        return listOfFizzBuzz;
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }
}
