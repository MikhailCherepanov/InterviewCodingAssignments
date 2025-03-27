import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test16 {

    public static void main(String[] args) {
        String str = "hheello World";

        System.out.println("Result : " + solution(str));
    }

    public static int solution(String str) {
        char[] chStr = str.toCharArray();
        String [] strArr = new String[chStr.length];
        for (int i = 0; i < chStr.length; i++) {
            strArr[i] = String.valueOf(chStr[i]);
        }

        HashMap<String, Long> map = (HashMap<String, Long>)Arrays.asList(strArr).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int counter = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return counter;
            }
            counter++;
        }
        return -1;
    }

}