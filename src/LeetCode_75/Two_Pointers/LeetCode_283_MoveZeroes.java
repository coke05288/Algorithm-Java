package LeetCode_75.Two_Pointers;

public class LeetCode_283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new LeetCode_283_MoveZeroes().moveZeroes(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();

        nums = new int[]{1, 2, 0, 1, 1};
        new LeetCode_283_MoveZeroes().moveZeroes(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();

        nums = new int[]{0,0,1};
        new LeetCode_283_MoveZeroes().moveZeroes(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void moveZeroes(int[] nums){

        int start = 0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] != 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
            }
        }
    }

}
