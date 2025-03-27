class Test19 {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println("Result : " + solution(strs));
    }

    public static String solution(String[] strs) {
        boolean isPrefix = false;
        String prefix = "";
        String longestPrefix = "";

        String shortestStr = strs[0];
        for (String str : strs) {
            if (str.length() < shortestStr.length()) {
                shortestStr = str;
            }
        }

        for(int i = 0; i < shortestStr.length(); i++) {
            prefix = prefix + shortestStr.toCharArray()[i];

            for (String str : strs) {
                String currPref = str.substring(0,prefix.length());
                if (currPref.equals(prefix)) {
                    isPrefix = true;
                } else {
                    isPrefix = false;
                }
            }
            if (isPrefix) {
                longestPrefix = prefix;
            }
        }
        return longestPrefix;

    }

}