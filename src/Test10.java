import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test10 {

   public static List<Integer> solution(int[] arr, int k) {
       List<Integer> res = new ArrayList<>();
       for (int i = 0; i < arr.length; i++) {
           for (int j = 1 + i; j < arr.length; j++) {
               if (arr[i] + arr[j] == k) {
                   res.add(i);
                   res.add(j);
                   return res;
               }
           }
       }
       return res;
   }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 15;

        System.out.println("Result : " + solution(arr, k));

    }

}
