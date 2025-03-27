import java.util.ArrayList;
import java.util.List;

public class Test20 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l3.add(7);
        l3.add(8);
        l3.add(9);
        list.add(l1);
        list.add(l2);
        list.add(l3);

        System.out.println("Rotated : " + rotareMatrix(list));
    }

    public static List<List<Integer>> rotareMatrix(List<List<Integer>> list) {
        List<List<Integer>> newList = new ArrayList<>();
        List<Integer> l1 = list.get(0);
        List<Integer> l2 = list.get(1);
        List<Integer> l3  = list.get(2);

        List<Integer> l1r = new ArrayList<>();
        List<Integer> l2r = new ArrayList<>();
        List<Integer> l3r  = new ArrayList<>();

        l1r.add(l3.get(0));
        l1r.add(l2.get(0));
        l1r.add(l1.get(0));

        l2r.add(l3.get(1));
        l2r.add(l2.get(1));
        l2r.add(l1.get(1));

        l3r.add(l3.get(2));
        l3r.add(l2.get(2));
        l3r.add(l1.get(2));

        newList.add(l1r);
        newList.add(l2r);
        newList.add(l3r);

        return newList;

    }

}
