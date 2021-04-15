import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> ConvertToFizzBuzz() {
        var listOfFizzBuzz = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                listOfFizzBuzz.add("Fizz");
            }
        }
        return listOfFizzBuzz;
    }
}
