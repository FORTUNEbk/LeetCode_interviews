public class IncreasingTripletSequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num:nums){
            if(num <= first){
                first = num;
            }else if(num <= second){
                second = num;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        IncreasingTripletSequence mySequence = new IncreasingTripletSequence();
        int [] myArray ={1,2,3,4,5};
        System.out.println(mySequence.increasingTriplet(myArray));
    }
}
