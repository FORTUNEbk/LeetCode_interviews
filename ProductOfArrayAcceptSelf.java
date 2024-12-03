
import java.util.Arrays;

public class ProductOfArrayAcceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Calculate prefix product
        int prefix = 1; // Start with 1 (nothing to the left of the first element)
        for (int i = 0; i < n; i++) {
            answer[i] = prefix; // Store the prefix product
            prefix *= nums[i];  // Update prefix for the next index
        }
        
        // Step 2: Calculate suffix product and combine
        int suffix = 1; // Start with 1 (nothing to the right of the last element)
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix; // Combine suffix with previously stored prefix
            suffix *= nums[i];   // Update suffix for the next index
        }
        
        return answer;
    }
   
    public static void main(String[] args) {
        
        ProductOfArrayAcceptSelf product = new ProductOfArrayAcceptSelf();
        int [] myArray = {1,2,3,4,5};
        int [] answer = product.productExceptSelf(myArray);
        System.out.println(Arrays.toString(answer));
    }
}
