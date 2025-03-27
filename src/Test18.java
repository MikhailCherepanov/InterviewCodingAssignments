import java.util.*;

// NOT SOLVED !!!!

class Test18 {

    public static void main(String[] args) {

//        int[][] routes = {{1,2,7},{3,6,7}};
//        int source = 1;
//        int target = 6;

        int[][] routes = {{7,12},{4,5,15},{6},{15,19},{9,12,13}};
        int source = 15;
        int target = 12;



        System.out.println("Result : " + numBusesToDestination(routes, source, target));

    }

    public static boolean hasValue(int[] route, int source, int target) {
        for (int i : route) {
            if (i == source || i == target) {
                return true;
            }
        }
        return false;
    }

    public static int numBusesToDestination(int[][] routes, int source, int target) {

        Map<int[], Boolean> map = new HashMap<>();

        for (int[] route : routes) {
            map.put(route, hasValue(route, source, target));
        }

        int idx = 0;

        while (idx != routes.length) {




        }



        int counter = 0;
        List<Integer> li = getInitRoutes(routes, source, target);
        if (li == null) {
            return -1;
        } else {
            counter = 2;
        }
        if (hasBoth(li, source, target)) {
            return counter;
        }

//        for (int[] route : routes) {
//            for (int stop : route) {
//                if ( stop == target || stop == source) {
//                    stopConter++;
//                    for (int st : route) {
//                        li.add(st);
//                    }
//                }
//            }
//        }







        System.out.println("");

        return -1;
    }


    public static List<Integer> getInitRoutes(int[][] routes, int source, int target) {
        List<Integer> li = new ArrayList<>();
        int stopConter = 0;
        for (int[] route : routes) {
            for (int stop : route) {
                if ( stop == target || stop == source) {
                    stopConter++;
                    for (int st : route) {
                        li.add(st);
                    }
                }
            }
        }
        if (stopConter == 2) {
            return li;
        } else {
            return null;
        }
    }

    public static boolean hasBoth(List<Integer> li, int source, int target) {
        int stopCounter = 0;
        for (int i : li) {
            if ( i == target || i == source) {
                stopCounter++;
            }
        }
        if (stopCounter == 2) {
            return true;
        } else {
            return false;
        }
    }

}