import java.util.ArrayList;
import java.util.List;

public class Test05 {

    public static void main(String[] args) {


        int l = 5;
        int r = 101;


        System.out.println(oddNumbers(l, r));
    }

    public static List<Integer> oddNumbers(int l, int r) {
        List res = new ArrayList();

        int start = (l % 2) == 0 ? l + 1 : l;

        for (int i = start; i <= r; i+=2) {
            res.add(i);
        }
        return res;
    }

}
