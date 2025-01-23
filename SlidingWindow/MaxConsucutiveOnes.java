package SlidingWindow;

public class MaxConsucutiveOnes {
    public static int longestOnes(int[] nums, int k){
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < nums.length){
            if(nums[right] == 0){
                k --;
            }

            while(k < 0){
                if(nums[left] == 0){
                    k ++;
                }
                left ++;
            }
            maxLength = Math.max(maxLength, right - left + 1);

            right ++;
        }
    return maxLength;
    }

    public static void main(String[] args) {
        MaxConsucutiveOnes myMethod = new MaxConsucutiveOnes();

        int []myArray = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(myMethod.longestOnes(myArray, k));
    }
}

