import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<Object> fizzBuzzIt(int n) {
        List<Object> intList = IntStream.range(0, n).mapToObj(i -> (i + 1) % 3 == 0 ? ((i + 1) % 5 == 0 ? "Fizz Buzz" : "Fizz") : ((i + 1) % 5 == 0 ? "Buzz" : i + 1)).collect(Collectors.toList());
        return intList;
    }
}
