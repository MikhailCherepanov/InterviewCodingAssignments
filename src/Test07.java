import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test07 {

    public static void main(String[] args) {


        List<Integer> arr = new ArrayList<>(
                Arrays.asList(1,
                        4,7,8,3,66));
        int k = 9;


        System.out.println(findNumber(arr, k));
    }

    public static String findNumber(List<Integer> arr, int k) {
        Optional<Integer> res = arr.stream().filter(f -> f == k).findFirst();
        return res.isEmpty() ? "NO" : "YES";
    }

}
