package SlidingWindow;

public class MaxAvgSubarray {

    public static double findMax(int [] nums, int k){

    double currentSum = 0;

    for(int i = 0;  i < k; i++){
        currentSum += nums[i];
    }

    double maxSum = currentSum;
    for(int i = k; i < nums.length; i++){
        currentSum = currentSum - nums[i - k] + nums[i];

        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum/k;
}
public static void main(String[] args) {

    int []myArray = {1, 3, 2, 4, 2, 6,};
    int k = 4;

    double result = findMax(myArray, k);

    System.out.println(result);

 }

}


