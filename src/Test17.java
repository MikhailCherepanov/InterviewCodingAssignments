// NOT SOLVED !!!!

//import org.w3c.dom.events.Event;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Test17 {
//
//// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
////
////Return the sum of the three integers.
////
////You may assume that each input would have exactly one solution.
////
////
////Example 1:
////
////Input: nums = [-1,2,1,-4], target = 1
////Output: 2
////Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
////Example 2:
////
////Input: nums = [0,0,0], target = 1
////Output: 0
////Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
//
//
//    public static void main(String[] args) {
//        int[] arr = {-1,2,1,-4};
//        int target = 1;
//
//        System.out.println("Result : " + findElements(arr, target););
//    }
//
//    public static int findElements(int[] arr, int target) {
//        // to store tmpArr as a key and its elements sum as a value
////        Map<int[], Integer> map = new HashMap<>();
//        int[] tmpArr = new int[3];
//
//        // Fill tmpArr with elements from arr
//        for (int i = 0; i < arr.length; i++) {
//            tmpArr= new int[3];
//            for (int j = i; j < arr.length; j++) {
//                for (int k = j; k < arr.length; k++) {
//                    tmpArr[k] = 0; //???????
//                }
//                if (tmpArr.length == 3) {
//                    int sum = 0;
//                    for (int i1 : tmpArr) {
//                        sum = sum + i1;
//                    }
//                    map.put(tmpArr, sum);
//                    tmpArr= new int[3];
//                }
//            }
//        }
//        // To store sum as a key and difference as a value
//        Map<Integer, Integer> mapDiff = new HashMap<>();
//
//        int diff = 0;
//
//        for (Map.Entry entry : map.entrySet()) {
//            if (target - entry.getValue() <= diff) {
//
//            }
//        }
//
//
//
//
//
//
//    }
//
//}