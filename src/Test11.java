import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test11 {

    public static void main(String[] args) {

       List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("red");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("green");
        colors.add("brown");
        colors.add("green");

        Map<String, Long> counted = colors.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Result : " + counted);

    }

}
