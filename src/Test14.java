import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test14 {

    public static void main(String[] args) {
        String Str="java is object oriented language";

        System.out.println("Result : ");
        solution(Str);
    }

    public static void solution(String str) {
        char [] chArr = str.toCharArray();
        String [] strArr = new String[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            strArr[i] = String.valueOf(chArr[i]);
        }



        Map<String, Long> map = Arrays.asList(strArr).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry entry : map.entrySet()) {

            System.out.println("Key : " + entry.getKey()+ ", Value : " + entry.getValue());
        }

    }

}