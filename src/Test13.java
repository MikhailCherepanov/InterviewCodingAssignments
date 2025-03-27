import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test13 {

    public static void main(String[] args) {
        String[] strings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Sunday", "Monday"};

        System.out.println("Duplicates : ");
        getDups(strings);
    }

    public static void getDups(String[] strings) {

        Map<String, Long> map = Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry entry : map.entrySet()) {
            int vv = Integer.parseInt(String.valueOf(entry.getValue()));
            if (vv > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

}