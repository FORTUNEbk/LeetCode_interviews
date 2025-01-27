package HashMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArrayDifference {
   public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<Integer> uniqueInNums1 = new ArrayList<>();
    List<Integer> uniqueInNums2 = new ArrayList<>();

    Set<Integer> set2 = new HashSet<>();
    for (int num : nums2) {
        set2.add(num);
    }

    for (int num : nums1) {
        if (!set2.contains(num)) {
            uniqueInNums1.add(num);
        }
    }

    Set<Integer> set1 = new HashSet<>();
    for (int num : nums1) {
        set1.add(num);
    }

    for (int num : nums2) {
        if (!set1.contains(num)) {
            uniqueInNums2.add(num);
        }
    }

    List<List<Integer>> result = new ArrayList<>();
    result.add(uniqueInNums1);
    result.add(uniqueInNums2);

    return result;
}
    public static void main(String[] args) {
        TwoArrayDifference myMethod = new TwoArrayDifference();
        int []num1 = {1,2,3};
        int []num2 = {2,4,6};

        System.out.println(myMethod.findDifference(num1, num2));
    }
}
