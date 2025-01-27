public class FindPivotIndex {
    public int pivotIndex(int[] nums) { 
       int sumLeft = 0;
       int totalSum = 0;

       for(int num:nums){
        totalSum += num;

       }
       for(int i = 0; i < nums.length; i++){
        if(sumLeft == totalSum - sumLeft - nums[i]){
            return i;
        }

        sumLeft +=nums[i];
    }

       return -1;
        
    }

    public static void main(String[] args) {
        FindPivotIndex myMethod = new FindPivotIndex();

        int []myArray = {1,7,3,6,5,6};

        System.out.println(myMethod.pivotIndex(myArray)); 
    }
    
}
