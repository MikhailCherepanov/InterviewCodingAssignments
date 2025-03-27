import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test15 {

    public static void main(String[] args) {
        String str = "Hello World";


        System.out.println("Result : " + solution(str));
    }

    public static String solution(String str) {

        char[] chStr = str.toCharArray();
        String result = "";

        for (int i = chStr.length - 1; i >= 0 ; i--) {
            result = result + chStr[i];
        }
        return result;
    }

}