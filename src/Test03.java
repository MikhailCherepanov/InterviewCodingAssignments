import java.util.ArrayList;
import java.util.List;

public class Test03 {
//    Find the first longest incrementing sequence in a given numeric string
//
//    Input : "12390123167890"
//    Output: "0123"

//    Input : "12434567"
//    Output: "34567"


    public static void main(String[] args) {
        String input = "12390123167890";

        System.out.println("Result : " + solution(input));
    }

    public static String solution (String input) {

        char[] arr = input.toCharArray();

        List<String> sequences = new ArrayList<>();
        String seq = "";
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp1 = Integer.parseInt(String.valueOf(arr[i]));
            int tmp2 = Integer.parseInt(String.valueOf(arr[i+1]));


            if ((tmp1 + 1) == tmp2) {
                seq = seq + tmp1;
            } else {
                seq = seq + tmp1;
                sequences.add(seq);
                seq = "";
            }
        }

        String longestSeq = sequences.get(0);
        for (String sequence : sequences) {
            if (sequence.length() > longestSeq.length()) {
                longestSeq = sequence;
            } else {
                if (sequence.length() == longestSeq.length()) {
                    char[] seqArr = sequence.toCharArray();
                    char[] LongSeqArr = longestSeq.toCharArray();
                    int tmp3 = Integer.parseInt(String.valueOf(seqArr[0]));
                    int tmp4 = Integer.parseInt(String.valueOf(LongSeqArr[0]));
                    if (tmp3 > tmp4) {
                        longestSeq = sequence;
                    }
                }
            }

        }
        return longestSeq;
    }
}
