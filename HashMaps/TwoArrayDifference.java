import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArrayDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> uniqueInNums1 = new HashSet<>(set1);
        uniqueInNums1.removeAll(set2);

        Set<Integer> uniqueInNums2 = new HashSet<>(set2);
        uniqueInNums2.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(uniqueInNums1));
        result.add(new ArrayList<>(uniqueInNums2));

        return result;
    }

    public static void main(String[] args) {
        TwoArrayDifference myMethod = new TwoArrayDifference();

        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        System.out.println(myMethod.findDifference(nums1, nums2));
    }
}
