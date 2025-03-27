public class Test04 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6};

        int[] res1 = new int[] {3,1,1,1,2,2};
        int[] res2 = new int[] {2,3,1,1,1,2};

        int k = 1;

        int lastElement = nums[nums.length-1];
        int holder = nums[1];
        for (int i = 1; i < nums.length-1; i++) {
            nums[i+1] = holder;
            if (i != nums.length - 2) {
                holder = nums[i+1];
            }
        }
        nums[0] = lastElement;


//        List<Employee> emps = new ArrayList<>();

//        emps.stream().filter(a -> a.getSalary() > 120000).collect(Collectors.toSet());
//        Collectors::uniqKeysMapMerger




//        int[] result = new int[] {1,0,0,2,0,3};

//        int number = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == number) {
//                nums[i] = 0;
//            } else {
//                number = nums[i];
//            }
//        }
        System.out.println("Result : ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");

        }
    }



}
