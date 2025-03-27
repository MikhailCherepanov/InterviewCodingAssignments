import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test12 {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(3,5,6,1,8,23,1,0);

        List<Integer> arr2 = arr.stream().sorted().collect(Collectors.toList());

        System.out.println(arr2);
    }
}

