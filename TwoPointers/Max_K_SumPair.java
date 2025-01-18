package TwoPointers;


class Max_K_SumPair {
    public int maxOperation(int[] nums, int k) {
        int left = 0;
        int right;
        int count = 0;

        while (left < nums.length) {
            right = left + 1; // Reset right pointer for each left
            while (right < nums.length) {
                int sum = nums[left] + nums[right];

                if (nums[left] != -1 && nums[right] != -1 && sum == k) {
                    // Pair found; mark elements as used and increment count
                    count++;
                    nums[left] = -1;
                    nums[right] = -1;
                    break; // Move to the next left
                }

                right++;
            }

            left++;
        }
        return count;
    }

    public static void main(String[] args) {
        Max_K_SumPair answer = new Max_K_SumPair();

        int[] nums1 = {1, 3, 3, 1};
        int k1 = 4;
        System.out.println(answer.maxOperation(nums1, k1)); // Output: 2

        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println(answer.maxOperation(nums2, k2)); // Output: 1
    }
}
