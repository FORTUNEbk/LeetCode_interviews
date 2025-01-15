package TwoPointers;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int write = 0; 

        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        for (int i = write; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeros pointers = new MoveZeros();
        int[] myArray = {0, 1, 0, 3, 12};

        pointers.moveZeroes(myArray); 

        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
