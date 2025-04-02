import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Test22 {

    public static void main(String[] args) {

        String str = "Welcome to the world of programming";

        System.out.println("Result : ");
        solution(str);
    }

    public static void solution(String str) {
        char[] chArr = str.toCharArray();
        int counter = 0;
        List<String> li = new ArrayList<>();

        for (char ch : chArr) {
            if (!String.valueOf(ch).equals(" ")) {
                counter++;
            }
            li.add(String.valueOf(ch));
        }
        System.out.println("Number of symbols (with no spaces) = " + counter);

        //////////

        Map<String, Long> map = li.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println("Element " + entry.getKey() + " is " + entry.getValue() + " times");
        }

    }

}