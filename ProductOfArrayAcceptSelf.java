
import java.util.Arrays;

public class ProductOfArrayAcceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        int prefix = 1; 
        for (int i = 0; i < n; i++) {
            answer[i] = prefix; 
            prefix *= nums[i];  
        }
        
        int suffix = 1; 
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix; 
            suffix *= nums[i];  
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
